package com.example.retrofitrec

import retrofit2.Call
import retrofit2.http.GET

interface Apiinterface {


    @GET("posts")
    fun getpost():Call<List<Post>>
}