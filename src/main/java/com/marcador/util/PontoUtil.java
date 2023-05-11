package com.marcador.util;

import com.marcador.jasper.ReportVIsualizarPontos;
import com.mycompany.mavenproject1.Tela1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * 
 * @author Jose.leite
 * @author vitor.santos
 */
public class PontoUtil {

    static JasperDesign jdesign;
    static JasperReport jreport;
    static JasperPrint jprint;
    static final int HORAS_MINUS = 500;
    static final int HORAS = 510;
    static final int HORAS_PLUS = 520;

    public static Map<String, String> obterDatas() {
        Map<String, String> dataHora = new LinkedHashMap<>();
        try {
            File file = PropertiesUtil.getFile();
            FileReader fr;
            BufferedReader br;
            boolean existe = file.exists();

            if (existe) {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                int i = 0;
                int j = 0;
                while (br.ready()) {
                    i++;
                    j++;
                    if (i == 1) {
                        br.readLine();
                        continue;
                    }
                    String result = br.readLine();
                    if (!result.isBlank()) {
                        dataHora.put(j + result.substring(12, 22), result.substring(22, 27));
                        if (j == 9) {
                            j = 0;
                        }
                    }
                }
                br.close();
                fr.close();
            }

        } catch (Exception ex) {
            Logger.getLogger(Tela1.class.getName()).log(Level.SEVERE, null, ex);

        }

        return dataHora;
    }

    public static HorasTrabalhadas calcularHoras(List<LocalTime> horasDia) {
        LocalTime time1 = null;
        LocalTime time2 = null;
        LocalTime time3 = null;
        LocalTime time4 = null;
        LocalTime time5 = null;
        LocalTime time6 = null;

        float horasTrabalhadas = 0;
        float positivas = 0;
        float negativas = 0;
        if (horasDia.size() >= 2 && horasDia.size() <= 4) {
            time1 = horasDia.get(0);
            time2 = horasDia.get(1);
        }
        if (horasDia.size() >= 4 && horasDia.size() <= 6) {
            time3 = horasDia.get(2);
            time4 = horasDia.get(3);
        }
        if (horasDia.size() == 6) {
            time5 = horasDia.get(4);
            time6 = horasDia.get(5);
        }

        if (time1 != null && time2 != null) {
            horasTrabalhadas += time1.until(time2, ChronoUnit.MINUTES);
        }
        if (time3 != null && time4 != null) {
            horasTrabalhadas += time3.until(time4, ChronoUnit.MINUTES);
        }
        if (time5 != null && time6 != null) {
            horasTrabalhadas = time5.until(time6, ChronoUnit.MINUTES);
        }

        if (horasTrabalhadas > HORAS_PLUS) {
            positivas = horasTrabalhadas - HORAS;
        }
        if (horasTrabalhadas < HORAS_MINUS) {
            negativas = HORAS - horasTrabalhadas;
        }

        return new HorasTrabalhadas(horasTrabalhadas, positivas, negativas);
    }

    public static void GerarReportApontamentos(List<ReportVIsualizarPontos> itens, Map<String,Object> parameters) throws Exception {
        jdesign = JRXmlLoader.load("ponto.jrxml");
        jreport = JasperCompileManager.compileReport(jdesign);
        jprint = JasperFillManager.fillReport(jreport, parameters, new JRBeanCollectionDataSource(itens));
        JasperViewer.viewReport(jprint, false);
    }
    
    
}
