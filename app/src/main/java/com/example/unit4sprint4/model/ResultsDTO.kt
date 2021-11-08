package com.example.unit4sprint4.model

import com.google.gson.annotations.SerializedName

data class ResultsDTO(

    @field:SerializedName("gender")
	val gender: String? = null,

    @field:SerializedName("name")
	val name: NameDTO? = null,

    @field:SerializedName("location")
	val location: LocationDTO? = null,

    @field:SerializedName("email")
	val email: String? = null,

    @field:SerializedName("login")
	val login: LoginDTO? = null,

    @field:SerializedName("dob")
	val dob: DobDTO? = null,

    @field:SerializedName("registered")
	val registered: RegisteredDTO? = null,

    @field:SerializedName("phone")
	val phone: String? = null,

    @field:SerializedName("cell")
	val cell: String? = null,

    @field:SerializedName("id")
	val id: IdDTO? = null,

    @field:SerializedName("picture")
	val picture: PictureDTO? = null,

    @field:SerializedName("nat")
	val nat: String? = null
)