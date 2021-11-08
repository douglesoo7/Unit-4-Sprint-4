package com.example.unit4sprint4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.unit4sprint4.api.RetrofitHelper
import com.example.unit4sprint4.api.UserAPI
import com.example.unit4sprint4.repository.UserRepository
import com.example.unit4sprint4.viewmodels.MainViewModel
import com.example.unit4sprint4.viewmodels.MainViewModelFactory


class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository=(application as UserApplication).userRepository

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.user.observe(this, Observer {
            Log.d("Sachin",it.results.toString())
        })




    }
}