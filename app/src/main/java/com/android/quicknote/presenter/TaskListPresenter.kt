package com.android.quicknote.presenter

import android.content.Context
import com.android.quicknote.base.BasePresenter
import com.android.quicknote.data.dao.QuickNoteDao
import com.android.quicknote.data.repository.TaskRepository
import com.android.quicknote.view.TaskListView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TaskListPresenter : BasePresenter<TaskListView>() {

    private lateinit var repository: TaskRepository

    override fun attachView(view: TaskListView) {
        super.attachView(view)
        repository = TaskRepository(view as Context)
    }

    fun getAllTasks(){
        GlobalScope.launch {
            val dbResponse = repository.getAllTasks()

            if (dbResponse.code != null) {
                if (dbResponse.code == QuickNoteDao.SUCCESS_CODE) {
                    view.showData(dbResponse.data)
                } else {
//                    onError()
                }
            } else {
//                onError()
            }
        }
    }
}