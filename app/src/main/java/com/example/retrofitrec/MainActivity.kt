package com.example.retrofitrec

import android.content.ContentValues.TAG
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitrec.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var apiinterface: Apiinterface =ApiData.getApiData().create(Apiinterface::class.java)
         apiinterface.getpost().enqueue(object  : Callback<List<Post>>{
             override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                 if (response.isSuccessful)
                   binding.recdata.layoutManager=LinearLayoutManager(applicationContext)
                 binding.recdata.adapter=PostAdepter(response.body())
             }

             override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Log.e(TAG,"onfailure : falure")
             }


         })
    }
}

