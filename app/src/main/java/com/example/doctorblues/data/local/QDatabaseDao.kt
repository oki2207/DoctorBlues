package com.example.doctorblues.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.doctorblues.data.model.Questions

@Dao
interface QDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(guest: Questions)

    @Query("SELECT * FROM Questions")
    fun getAll(): LiveData<List<Questions>>
}
