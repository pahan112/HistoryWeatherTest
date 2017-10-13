package project.company.com.historyweathertest.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pahan on 13.10.2017.
 */

public class Weather implements Serializable {
    @SerializedName("main")
    private String mMain;

    @NonNull
    public String getMain() {
        return mMain;
    }

    public void setMain(@NonNull String main) {
        mMain = main;
    }

}
