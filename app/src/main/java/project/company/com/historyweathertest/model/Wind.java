package project.company.com.historyweathertest.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pahan on 13.10.2017.
 */

public class Wind implements Serializable {
    @SerializedName("speed")
    private double mSpeed;

    public int getSpeed() {
        return (int) mSpeed;
    }
}
