package com.example.unit4sprint4.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.unit4sprint4.NetworkUtils
import com.example.unit4sprint4.api.UserAPI
import com.example.unit4sprint4.db.UserDatabase
import com.example.unit4sprint4.model.ResponseDTO
import com.example.unit4sprint4.model.ResultsDTO

class UserRepository(
    private val userAPI: UserAPI,
    private val userDatabase: UserDatabase,
    private val applicationContext: Context
) {

    private val userLiveData = MutableLiveData<ResponseDTO>()

    val user: LiveData<ResponseDTO>
        get() = userLiveData

    suspend fun getUsers() {

        if (NetworkUtils.isInternetAvailable(applicationContext)){
            val result = userAPI.getUser()
            if (result?.body() != null) {
                userDatabase.userDao().addUser(result.body()!!.results as List<ResultsDTO>)
                userLiveData.postValue(result.body())
            }
        }
        else{
            val user=userDatabase.userDao().getUser()
            //userLiveData.postValue(user)
        }


    }
}