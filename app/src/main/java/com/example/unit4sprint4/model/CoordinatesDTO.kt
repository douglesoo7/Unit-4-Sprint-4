package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class CoordinatesDTO(

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)