package com.example.doctorblues.data.local

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.doctorblues.data.model.Questions
import com.example.doctorblues.data.model.Score
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

@Dao
interface ScoreDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(score: Score)
    @Update
    suspend fun update(score: Score)

    @Query("SELECT * FROM Score")
     fun getAll(): LiveData<List<Score>>

    @Query("DELETE FROM Score")
    suspend fun delete()

}

