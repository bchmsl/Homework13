package com.bchmsl.homework13.network

import com.bchmsl.homework13.BuildConfig
import com.bchmsl.homework13.model.Item
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface ApiClient {
    @GET("3588163c-a9c8-488c-af9a-534b392e7128")
    suspend fun getItems(): Response<Item>
}