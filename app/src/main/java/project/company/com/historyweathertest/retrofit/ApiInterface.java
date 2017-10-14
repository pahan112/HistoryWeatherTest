package project.company.com.historyweathertest.retrofit;

import android.support.annotation.NonNull;

import project.company.com.historyweathertest.model.City;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Pahan on 13.10.2017.
 */

public interface ApiInterface {
    @GET("data/2.5/weather?units=metric")
    Call<City> getWeatherGPS(@NonNull @Query("lat") double lat, @Query("lon") double lon);
    @GET("data/2.5/weather?units=metric")
    Call<City> getWeatherHistory(@NonNull @Query("q") String query);
}
