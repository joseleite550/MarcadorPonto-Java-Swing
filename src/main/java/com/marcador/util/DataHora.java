package com.marcador.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataHora {

    private List<MarcacaoPonto> datas = new ArrayList<>();

    /**
     * @return the datas
     */
    public List<MarcacaoPonto> getDatas() {
        return datas;
    }

    /**
     * 
     * @param date 
     */
    public void addData(LocalDate date) {
        MarcacaoPonto dt = new MarcacaoPonto();
        dt.setData(date);
        boolean existe = false;
        for (MarcacaoPonto data : this.datas) {
            if (data.getData().equals(date)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            this.datas.add(dt);
        }
    }
    
    /**
     * @param date
     * @param time 
     */
    public void salvarHora(LocalDate date, LocalTime time) {
        for (int i = 0; i < datas.size(); i++) {
            if (datas.get(i).getData().equals(date)) {
                datas.get(i).addHora(time);
                break;
            }
        }
    }

    public void ordenar() {
        List<LocalDate> localDates = new ArrayList<>();
        for (MarcacaoPonto p : datas) {
            localDates.add(p.getData());
        }
        Collections.sort(localDates, (d1, d2) -> {
            return d1.compareTo(d2);
        });

        List<MarcacaoPonto> tmp = new ArrayList<>();
            for(LocalDate localDate: localDates){
                for(MarcacaoPonto t: datas){
                    if(t.getData().equals(localDate)){
                        MarcacaoPonto time = new MarcacaoPonto();
                        time.setData(t.getData());
                        time.setHoras(t.getHoras());
                        tmp.add(time);
                        break;
                    }
                }
            }
        this.datas = tmp;
        ordenarHora();
    }

    public void ordenarHora() {
        for (MarcacaoPonto date : this.datas) {
            Collections.sort(date.getHoras(), (d1, d2) -> {
                return d1.compareTo(d2);
            });
        }
    }

}
