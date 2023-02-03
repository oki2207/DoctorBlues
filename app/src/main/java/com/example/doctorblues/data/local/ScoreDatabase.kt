package com.example.doctorblues.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.doctorblues.data.model.Questions
import com.example.doctorblues.data.model.Score

@Database(entities = [Score::class], version = 1)
abstract class ScoreDatabase : RoomDatabase() {

    abstract val ScoreDatabaseDao: ScoreDatabaseDao
}

private lateinit var INSTANCE: ScoreDatabase

fun getDatabase(context: Context): ScoreDatabase {
    synchronized(ScoreDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                ScoreDatabase::class.java,
                "ScoreDatabase"
            ).build()
        }
    }
    return INSTANCE
}