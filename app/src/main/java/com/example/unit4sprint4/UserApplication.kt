package com.example.unit4sprint4

import android.app.Application
import com.example.unit4sprint4.api.RetrofitHelper
import com.example.unit4sprint4.api.UserAPI
import com.example.unit4sprint4.db.UserDatabase
import com.example.unit4sprint4.repository.UserRepository

class UserApplication:Application() {
    lateinit var userRepository: UserRepository
    override fun onCreate() {
        super.onCreate()

        initialize()
    }

    private fun initialize() {
        val usersAPI= RetrofitHelper.getInstance().create(UserAPI::class.java)
        val database=UserDatabase.getDatabase(applicationContext)
        userRepository = UserRepository(usersAPI,database)
    }
}