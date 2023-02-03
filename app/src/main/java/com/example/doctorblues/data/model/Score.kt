package com.example.doctorblues.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.OffsetDateTime
import java.util.Date


@Entity
data class Score (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: String,
    var score: Int
)

