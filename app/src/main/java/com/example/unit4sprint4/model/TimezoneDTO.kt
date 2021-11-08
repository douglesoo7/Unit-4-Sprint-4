package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class TimezoneDTO(

	@field:SerializedName("offset")
	val offset: String? = null,

	@field:SerializedName("description")
	val description: String? = null
)