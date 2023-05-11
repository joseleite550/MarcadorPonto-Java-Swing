package com.marcador.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MarcacaoPonto {
     LocalDate data;
     List<LocalTime> horas = new ArrayList<>();
     
    public MarcacaoPonto() {
       
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<LocalTime> getHoras() {
        return horas;
    }

    public void setHoras(List<LocalTime> Horas) {
        this.horas = Horas;
    }
    
    /**
     * @param hora
     */
    public void addHora(LocalTime hora) {
        this.horas.add(hora);
    }
    
    public void addHoras(List<LocalTime> horas) {
        this.horas.addAll(horas);
    }

    public String getDia(){
        return DaysOfWeek.value(this.data.getDayOfWeek().getValue()).toString();      
    }
     
        public enum DaysOfWeek  {
        
        Seg(1),
        Ter(2),
        Qua(3),
        Qui(4),
        Sex(5),
        Sab(6),
        Dom(7);
        private int index;
        private DaysOfWeek(int index){
            this.index = index;
        }
        public int getCod(){
            return index;
        }
        public static DaysOfWeek value(int index){
            for(DaysOfWeek dia: DaysOfWeek.values()){
                if(dia.getCod() == index){
                    return dia;
                }
            }
            return null;
        }
    }
}
