package com.example.retrofitrec

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiData {

    companion object{

        var Base_URL="https://jsonplaceholder.typicode.com/"
        lateinit var retrofit:Retrofit

        fun getApiData():Retrofit{
retrofit=Retrofit.Builder()
    .baseUrl(Base_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
            return  retrofit
        }
    }
}