package project.company.com.historyweathertest.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pahan on 13.10.2017.
 */

public class Main implements Serializable {
    @SerializedName("temp")
    private double mTemp;
    @SerializedName("temp_max")
    private double mTempMax;
    @SerializedName("temp_min")
    private double mTempMin;

    public double getTempMin() {
        return mTempMin;
    }

    public double getTempMax() {
        return mTempMax;
    }

    public int getTemp() {
        return (int) mTemp;
    }

}
