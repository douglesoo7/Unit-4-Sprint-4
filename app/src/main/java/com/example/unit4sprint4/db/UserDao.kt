package com.example.unit4sprint4.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.unit4sprint4.model.ResultsDTO

@Dao
interface UserDao {

    @Insert
    suspend fun addUser(user:List<ResultsDTO>)

    @Query("SELECT * FROM user")
    suspend fun getUser(): List<ResultsDTO>

}