package com.marcador.util;

import java.util.List;

/**
 * 
 * @author Jose.leite
 * @author vitor.santos
 */
public class HorasTrabalhadas {

    public final String HORAS_POSITIVAS = " Horas Positivas: ";
    public final String HORAS_NEGATIVAS = " Horas Negativas: ";
    public final String HORAS_TRABALHADAS = " Horas Trabalhadas: ";

    private float horasTrabalhadas;
    private float horasPositivas;
    private float horasNegativas;

    public HorasTrabalhadas() {
        this.horasTrabalhadas = 0;
        this.horasPositivas = 0;
        this.horasNegativas = 0;
    }

    public HorasTrabalhadas(float hTrabalhadas, float hPositivas, float hNegativas) {
        this.horasTrabalhadas = hTrabalhadas;
        this.horasPositivas = hPositivas;
        this.horasNegativas = hNegativas;
    }

    /**
     * @return the horasTrabalhadas
     */
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;

    }

    /**
     * @param horasTrabalhadas the horasTrabalhadas to set
     */
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * @return the horasPositivas
     */
    public float getHorasPositivas() {
        return horasPositivas;
    }

    /**
     * @param horasPositivas the horasPositivas to set
     */
    public void setHorasPositivas(float horasPositivas) {
        this.horasPositivas = horasPositivas;
    }

    /**
     * @return the horasNegativas
     */
    public float getHorasNegativas() {
        return horasNegativas;
    }

    /**
     * @param horasNegativas the horasNegativas to set
     */
    public void setHorasNegativas(float horasNegativas) {
        this.horasNegativas = horasNegativas;
    }

    public void addHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }

    /**
     * @param horasPositivas the horasPositivas to set
     */
    public void addHorasPositivas(float horasPositivas) {
        this.horasPositivas += horasPositivas;
    }

    /**
     * @param horasNegativas the horasNegativas to set
     */
    public void addHorasNegativas(float horasNegativas) {
        this.horasNegativas += horasNegativas;
    }

    public void addHoras(List<HorasTrabalhadas> horasT) {
        for (HorasTrabalhadas h : horasT) {
            addHorasNegativas(h.getHorasNegativas());
            addHorasPositivas(h.getHorasPositivas());
            addHorasTrabalhadas(h.getHorasTrabalhadas());
        }
    }

    public static String toHora(float hora) {
        Integer HT = (int) hora;
        Integer MT = HT % 60;
        return HT / 60 + ":" + (MT>9?MT:"0"+MT);

    }
    public static String calcularHoras(float hora){
        Integer HT = (int) hora;
        Integer MT = HT % 60;
        String sinal;
        if(hora<0)
            sinal = "-";
        else 
            sinal = "";
        if(MT<0){
            MT *=-1;
        }
        String min;
        if(MT>9){
            min = MT.toString();
        }else{
            min = "0"+MT.toString();
        }
        return sinal +" "+ HT / 60 + ":" + min;
    }

    public String getTrabalhadas() {
        return toHora(horasTrabalhadas);
    }

    public String getPositivas() {
        return toHora(horasPositivas);
    }

    public String getNegativas() {
        return toHora(horasNegativas);
    }

    @Override
    public String toString() {
        String txt = HORAS_TRABALHADAS
                + getTrabalhadas()+ "\n" + HORAS_POSITIVAS + getPositivas()+ "\n" + HORAS_NEGATIVAS + getNegativas();

        return txt;
    }

}
