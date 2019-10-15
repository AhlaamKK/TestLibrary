package com.example.mygoselllibrary.ApiConnection;


import com.example.mygoselllibrary.models.CreditResponseParser;
import com.example.mygoselllibrary.models.UserResponseParser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterfaces {


        @GET("1")
         Call<UserResponseParser> getUserDetails();
        @FormUrlEncoded
        @POST("credits")
         Call<CreditResponseParser> getCreditTransactions(@Field("id") String Id, @Field("currency") String currency, @Field("amount") String amount, @Field("source") Object sourceId);

        @POST("debits")
        Call<CreditResponseParser> getDebitTransactions(@Field("id") String Id, @Field("currency") String currency, @Field("amount") String amount, @Field("destination_id") String destinationId, @Field("source") Object sourceId);



}
