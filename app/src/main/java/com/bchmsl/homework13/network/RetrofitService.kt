package com.bchmsl.homework13.network

import com.bchmsl.homework13.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitService {
    suspend fun getItems(): ApiClient = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(ApiClient::class.java)
}