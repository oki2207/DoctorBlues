package com.example.doctorblues.data

import com.squareup.moshi.Json

data class Questions(
    @Json(name = "question")
    val questions: String,

    @Json(name = "answerA")
    val answera: String,

    @Json(name = "answerB")
    val answerb: String,

    @Json(name = "answerC")
    val answerc: String,

    @Json(name = "answerD")
    val answerd: String,
)

