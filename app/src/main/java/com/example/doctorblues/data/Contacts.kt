package com.example.doctorblues.data

import com.squareup.moshi.Json

data class Contacts(

    @Json(name = "titel")
    val titel: String,

    @Json(name = "name")
    val name: String,

    @Json(name = "surname")
    val surname: String,

    @Json(name = "field")
    val field: String,

    @Json(name = "adress")
    val adress: String,

    @Json(name = "plz")
    val plz: String,

    @Json(name = "city")
    val city: String,

    @Json(name = "phone")
    val phone: String


)
