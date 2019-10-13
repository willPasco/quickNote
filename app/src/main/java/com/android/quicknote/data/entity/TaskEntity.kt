package com.android.quicknote.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TaskEntity")
data class TaskEntity(@PrimaryKey(autoGenerate = true)
                var id:Int)
