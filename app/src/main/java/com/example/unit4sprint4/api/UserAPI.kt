package com.example.unit4sprint4.api

import com.example.unit4sprint4.model.ResponseDTO
import retrofit2.Response
import retrofit2.http.GET


interface UserAPI {
    @GET("/api")
    suspend fun getUser():Response<ResponseDTO>
}