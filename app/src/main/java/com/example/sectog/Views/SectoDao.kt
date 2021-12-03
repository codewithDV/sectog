package com.example.sectog.Views

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SectoDao {
    @Query("Select*from UserInfo")
    fun getall(): List<Id>

    @Insert
    fun insert(id: Id)

    @Delete
    fun delete(id: Id)
}