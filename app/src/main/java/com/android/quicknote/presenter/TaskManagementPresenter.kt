package com.android.quicknote.presenter

import android.content.Context
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

    fun insertTask(taskEntity: TaskEntity) {
        GlobalScope.launch {
            val dbResponse = repository!!.insertTask(taskEntity)

            if (dbResponse.code != null) {
                if (dbResponse.code == QuickNoteDao.SUCCESS_CODE) {
                    view.dbRequestSuccess()
                }
            }
        }
    }
}