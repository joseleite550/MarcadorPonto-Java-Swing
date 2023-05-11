package com.marcador.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * 
 * @author Jose.leite
 * @author vitor.santos
 */
public class Slip {

    @SerializedName("slip")
    @Expose
    private SlipMessage slip;

    public SlipMessage getSlip() {
        return slip;
    }

    public void setSlipMessge(SlipMessage slip) {
        this.slip = slip;
    }

}
