package com.marcador.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author Jose.leite
 * @author vitor.santos
 */
public class SlipMessage {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("advice")
    @Expose
    private String advice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

}
