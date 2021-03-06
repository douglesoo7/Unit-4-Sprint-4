package com.example.unit4sprint4.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.unit4sprint4.api.UserAPI
import com.example.unit4sprint4.model.ResponseDTO

class UserRepository(private val userAPI: UserAPI) {

    private val userLiveData = MutableLiveData<ResponseDTO>()

    val user: LiveData<ResponseDTO>
        get() = userLiveData

    suspend fun getUsers() {

        val result = userAPI.getUser()
        if (result?.body() != null) {
            //userDatabase.userDao().addUser(result.body()!!.results as List<ResultsDTO> )
            userLiveData.postValue(result.body())
        }
    }
}