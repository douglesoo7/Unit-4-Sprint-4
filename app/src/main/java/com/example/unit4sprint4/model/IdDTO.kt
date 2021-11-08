package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class IdDTO(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)