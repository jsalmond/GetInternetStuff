package com.jtecx.getinternetstuff;


import android.util.Log;

import com.jtecx.getinternetstuff.data.Lottery;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface LotteryAPI {
    String BASE_URL = "https://data.ny.gov/resource/h6w8-42p9.json/";

    @GET("?$$app_token=O1pR7hGtxKw3s6gurSXXkyy7V")
    Call<Lottery> getLottery();


    class Factory {
        static final String TAG = "LootyPool";
        public static LotteryAPI service;

        public static LotteryAPI getIstance() {
            Log.d(TAG, "At getIstance");
            if (service == null) {
                Log.d(TAG, "service is null");
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).build();
                service = retrofit.create(LotteryAPI.class);
                return service;
            } else {
                Log.d(TAG, "service is not Null");
                return service;
            }
        }
    }
}