package com.android.quicknote.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.android.quicknote.data.entity.TaskEntity

@Dao
interface QuickNoteDao {

    companion object{
        const val SUCCESS_CODE = 500
        const val ERROR_CODE = 400
    }

    @Insert
    fun insertTask(taskEntity: TaskEntity)
}
