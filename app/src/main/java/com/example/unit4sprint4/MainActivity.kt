package com.example.unit4sprint4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.unit4sprint4.api.RetrofitHelper
import com.example.unit4sprint4.api.UserAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usersAPI=RetrofitHelper.getInstance().create(UserAPI::class.java)

        GlobalScope.launch {
            val result=usersAPI.getUser()
            if (result!=null){
                Log.d("Sachin",result.body().toString())
                val user=result.body()
            }

        }

    }
}