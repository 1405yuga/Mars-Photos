package com.example.android.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"
private val retrofitBuilder = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

object MarsApi{
    val retrofitService : MapsApiService by lazy{
        retrofitBuilder.create(MapsApiService::class.java)
    }
}
interface MapsApiService{

    @GET("photos")
    fun getPhotos() : String
}
