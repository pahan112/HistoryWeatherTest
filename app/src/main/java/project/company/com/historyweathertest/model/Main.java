package project.company.com.historyweathertest.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pahan on 13.10.2017.
 */

public class Main implements Serializable {
    @SerializedName("temp")
    private double mTemp;

    @SerializedName("pressure")
    private double mPressure;

    @SerializedName("humidity")
    private double mHumidity;

    public int getTemp() {
        return (int) mTemp;
    }

    public int getPressure() {
        return (int) mPressure;
    }

    public int getHumidity() {
        return (int) mHumidity;
    }
}
