package com.example.unit4sprint4.Model

import com.google.gson.annotations.SerializedName

data class ResponseDTO(

	@field:SerializedName("results")
	val results: List<ResultsDTO?>? = null,

	@field:SerializedName("info")
	val info: InfoDTO? = null
)