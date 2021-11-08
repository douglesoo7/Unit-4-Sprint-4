package com.example.unit4sprint4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.unit4sprint4.api.RetrofitHelper
import com.example.unit4sprint4.api.UserAPI
import com.example.unit4sprint4.repository.UserRepository
import com.example.unit4sprint4.viewmodels.MainViewModel
import com.example.unit4sprint4.viewmodels.MainViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usersAPI=RetrofitHelper.getInstance().create(UserAPI::class.java)
        val repository = UserRepository(usersAPI)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)




    }
}