package space.merunka.workerslist.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiFactory {
    private static ApiFactory apiFactory;
    private static Retrofit retrofit;
    private static final String BASE_URL = "http://gitlab.65apps.com/65gb/static/raw/master/";

    private ApiFactory(){
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

    public static ApiFactory getInstance(){
        if (apiFactory == null){
                apiFactory = new ApiFactory();
            }
            return apiFactory;
    }

    public ApiService getApiService(){
        return retrofit.create(ApiService.class);
    }
}
