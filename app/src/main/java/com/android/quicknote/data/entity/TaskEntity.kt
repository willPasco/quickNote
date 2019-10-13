package com.android.quicknote.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TaskEntity")
 class TaskEntity(@PrimaryKey var id: Long, @ColumnInfo(name = "title") var title:String)
