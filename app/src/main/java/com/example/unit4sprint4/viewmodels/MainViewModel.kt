package com.example.unit4sprint4.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unit4sprint4.model.ResponseDTO
import com.example.unit4sprint4.model.ResultsDTO
import com.example.unit4sprint4.repository.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: UserRepository) : ViewModel() {
    init {
        viewModelScope.launch (Dispatchers.IO) {
            repository.getUsers()
        }
    }

    val user:LiveData<ResponseDTO>
    get() = repository.user
}