package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class DobDTO(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
)