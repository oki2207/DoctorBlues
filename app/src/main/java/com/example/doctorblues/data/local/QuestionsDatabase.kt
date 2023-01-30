package com.example.doctorblues.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.doctorblues.data.model.Questions

@Database(entities = [Questions::class], version = 1)
abstract class QuestionsDatabase : RoomDatabase() {

    abstract val guestDatabaseDao: QDatabaseDao
}

private lateinit var INSTANCE: QuestionsDatabase

fun getDatabase(context: Context): QuestionsDatabase {
    synchronized(QuestionsDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                QuestionsDatabase::class.java,
                "Questions"
            ).build()
        }
    }
    return INSTANCE
}