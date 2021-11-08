package com.example.unit4sprint4.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PictureDTO(

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null
)