package com.android.test.net;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * API Call Here
 */
public interface ApiInterface {
    @GET("collection")
    public Call<ResponseBody> getPlanInfo();
}
