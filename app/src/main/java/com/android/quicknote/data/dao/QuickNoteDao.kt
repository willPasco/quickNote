package com.android.quicknote.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.android.quicknote.data.entity.TaskEntity

@Dao
interface QuickNoteDao {

    companion object{
        const val SUCCESS_CODE = 500
        const val ERROR_CODE = 400
    }

    @Insert
    fun insertTask(taskEntity: TaskEntity)

    @Query("SELECT * from task_table ORDER BY id ASC")
    fun getAllTasks(): List<TaskEntity>
}
