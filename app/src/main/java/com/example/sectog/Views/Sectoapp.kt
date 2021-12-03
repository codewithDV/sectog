package com.example.sectog.Views

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserInfo")
data class Id(
    @PrimaryKey(autoGenerate = true) var Numid: Int? = null,
    @ColumnInfo(name = "userId") var Id: Int? = null,
    @ColumnInfo(name = "UserPassword") var Password: Int? = null,

    )
