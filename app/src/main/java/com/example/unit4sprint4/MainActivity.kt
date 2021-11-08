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
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userAPI = RetrofitHelper.getInstance().create(UserAPI::class.java)
        val repository = UserRepository(userAPI)

        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.user.observe(this, Observer {
            val name =
                it?.results?.get(0)?.name?.title + " " + it?.results?.get(0)?.name?.first + " " + it?.results?.get(
                    0
                )?.name?.last

            val city = it?.results?.get(0)?.location?.city
            val country = it?.results?.get(0)?.location?.country
            val gender = it?.results?.get(0)?.gender
            val phone = it?.results?.get(0)?.phone.toString()
            val dob=it?.results?.get(0)?.dob?.date.toString()
            val email=it?.results?.get(0)?.email.toString()
            tvName.text = name
            tvCity.text = city
            tvCountry.text = country
            tvGender.text = gender
            tvPhone.text = phone
            tvDOB.text=dob
            tvEmail.text=email

            //Log.d("Sachin", it.results.toString())
        })


    }

    private fun setData() {

    }
}