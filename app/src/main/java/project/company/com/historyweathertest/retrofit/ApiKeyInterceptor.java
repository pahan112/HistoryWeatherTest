package project.company.com.historyweathertest.retrofit;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import project.company.com.historyweathertest.global.Constans;

/**
 * Created by Pahan on 13.10.2017.
 */

public class ApiKeyInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url().newBuilder()
                .addQueryParameter("appid", Constans.API_KEY)
                .build();
        request = request.newBuilder().url(url).build();
        return chain.proceed(request);
    }
}

