package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class StreetDTO(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("name")
	val name: String? = null
)