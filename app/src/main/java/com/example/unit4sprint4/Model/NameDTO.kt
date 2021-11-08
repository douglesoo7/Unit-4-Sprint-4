package com.example.unit4sprint4.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NameDTO(

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("first")
	val first: String? = null,

	@field:SerializedName("last")
	val last: String? = null
)