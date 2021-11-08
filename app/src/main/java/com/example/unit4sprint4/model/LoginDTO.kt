package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class LoginDTO(

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("salt")
	val salt: String? = null,

	@field:SerializedName("md5")
	val md5: String? = null,

	@field:SerializedName("sha1")
	val sha1: String? = null,

	@field:SerializedName("sha256")
	val sha256: String? = null
)