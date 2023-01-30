package com.example.doctorblues.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "Questions")

data class Questions(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

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

