package com.android.quicknote.presenter

import android.content.Context
import android.util.Log
import com.android.quicknote.base.BasePresenter
import com.android.quicknote.data.dao.QuickNoteDao
import com.android.quicknote.data.entity.TaskEntity
import com.android.quicknote.data.repository.TaskRepository
import com.android.quicknote.view.TaskManagementView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TaskManagementPresenter : BasePresenter<TaskManagementView>() {

    var repository: TaskRepository? = null

    override fun attachView(view: TaskManagementView) {
        super.attachView(view)
        repository = TaskRepository(view as Context)
    }

    fun insertTask(title: String) {
        GlobalScope.launch {
            val timestamp = System.currentTimeMillis()/1000
            val taskEntity = TaskEntity(timestamp, title)

            val dbResponse = repository!!.insertTask(taskEntity)

            Log.i("test", dbResponse.toString())

            if (dbResponse.code != null) {
                if (dbResponse.code == QuickNoteDao.SUCCESS_CODE) {
                    view.dbRequestSuccess()
                } else {
                    onError()
                }
            } else {
                onError()
            }
        }
    }

    private fun onError() {
        view.dbRequestError()
    }
}