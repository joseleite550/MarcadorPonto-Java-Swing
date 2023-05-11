package com.marcador.jasper;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Jose.leite
 * @author Vitor.Santos
 */
public class ReportVIsualizarPontos {

    private String dia;
    private LocalDate data;
    private LocalTime hora1;
    private LocalTime hora2;
    private LocalTime hora3;
    private LocalTime hora4;
    private LocalTime hora5;
    private LocalTime hora6;
    private String total;
    private String positivas;
    private String negativas;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora1() {
        return hora1;
    }

    public void setHora1(LocalTime hora1) {
        this.hora1 = hora1;
    }

    public LocalTime getHora2() {
        return hora2;
    }

    public void setHora2(LocalTime hora2) {
        this.hora2 = hora2;
    }

    public LocalTime getHora3() {
        return hora3;
    }

    public void setHora3(LocalTime hora3) {
        this.hora3 = hora3;
    }

    public LocalTime getHora4() {
        return hora4;
    }

    public void setHora4(LocalTime hora4) {
        this.hora4 = hora4;
    }

    public LocalTime getHora5() {
        return hora5;
    }

    public void setHora5(LocalTime hora5) {
        this.hora5 = hora5;
    }

    public LocalTime getHora6() {
        return hora6;
    }

    public void setHora6(LocalTime hora6) {
        this.hora6 = hora6;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPositivas() {
        return positivas;
    }

    public void setPositivas(String positivas) {
        this.positivas = positivas;
    }

    public String getNegativas() {
        return negativas;
    }

    public void setNegativas(String negativas) {
        this.negativas = negativas;
    }
    
    public void setHoras(LocalTime hora){
        if(hora1==null){
            setHora1(hora);
        }else if(hora2==null){
            setHora2(hora);
            
        }else if(hora3==null){
            setHora3(hora);
        }
        else if(hora4==null){
            setHora4(hora);
        
        }else if(hora5==null){
            setHora5(hora);
        }else if(hora6==null){
            setHora6(hora);
        }
        
    }

}
