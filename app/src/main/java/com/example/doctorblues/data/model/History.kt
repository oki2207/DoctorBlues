package com.example.doctorblues.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

data class History(var id: Int, var date: String, var score: Int)