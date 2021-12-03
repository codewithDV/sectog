package com.example.sectog.Views

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Id::class],
    version = 1
)
abstract class SectoDataBase : RoomDatabase(){
    abstract fun SectoDao(): SectoDao

    companion object {
        @Volatile private var instance: SectoDataBase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            SectoDataBase::class.java, "todo-list.db")
            .build()
    }
}
