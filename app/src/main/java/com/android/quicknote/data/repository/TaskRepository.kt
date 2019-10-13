package com.android.quicknote.data.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.android.quicknote.data.dao.QuickNoteDao
import com.android.quicknote.data.db.QuickNoteDatabase
import com.android.quicknote.data.entity.TaskEntity
import com.android.quicknote.data.util.DataWrapper
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class TaskRepository(context: Context) {

    companion object {
        private const val TAG = "TaskRepository"
    }

    private var dao: QuickNoteDao = QuickNoteDatabase.getDatabase(context).quickNoteDao()

    suspend fun insertTask(taskEntity: TaskEntity): DataWrapper<TaskEntity> {
        return withContext(IO) {

            val wrapper = DataWrapper<TaskEntity>()

            try {

                dao.insertTask(taskEntity)
                wrapper.code = QuickNoteDao.SUCCESS_CODE
            } catch (e: RuntimeException) {
                Log.e(TAG, e.message)

                wrapper.code = QuickNoteDao.ERROR_CODE
                if (e.message != null) {
                    wrapper.message = e.message
                }
            }

            wrapper
        }
    }

    suspend fun getAllTasks(): DataWrapper<List<TaskEntity>> {
        return withContext(IO) {
            val wrapper = DataWrapper<List<TaskEntity>>()
            try {

                wrapper.data = dao.getAllTasks()
                wrapper.code = QuickNoteDao.SUCCESS_CODE
            } catch (e: RuntimeException) {
                Log.e(TAG, e.message)

                wrapper.code = QuickNoteDao.ERROR_CODE
                if (e.message != null) {
                    wrapper.message = e.message
                }
            }

            wrapper

        }
    }

}