package project.company.com.historyweathertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import project.company.com.historyweathertest.R;
import project.company.com.historyweathertest.global.Constans;
import project.company.com.historyweathertest.model.City;
import project.company.com.historyweathertest.retrofit.RetrofitMain;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HistoryActivity extends AppCompatActivity {

    @BindView(R.id.tv_history_city)
    TextView mTextViewHistoryCity;
    @BindView(R.id.tv_temperature_max)
    TextView mTextViewTemperatureMax;
    @BindView(R.id.tv_temperature_min)
    TextView mTextViewTemperatureMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ButterKnife.bind(this);

        String value = getIntent().getExtras().getString(Constans.CITY_NAME);
        getWeatherHistory(value);
    }

    private void getWeatherHistory(final String city) {
        Call<City> getWeather = RetrofitMain.getApiInterface().getWeatherHistory(city);
        getWeather.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                mTextViewHistoryCity.setText(city);
                mTextViewTemperatureMax.setText(getString(R.string.f_temperature, (int)response.body().getMain().getTempMax()));
                Log.d("myLog",response.body().getMain().getTempMax() + " df");
                mTextViewTemperatureMin.setText(getString(R.string.f_temperature, (int)response.body().getMain().getTempMin()));
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {

            }
        });
    }

    @OnClick(R.id.iv_back)
    void clickBack() {
        onBackPressed();
    }
}
