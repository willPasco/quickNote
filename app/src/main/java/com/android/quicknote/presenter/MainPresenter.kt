package com.android.quicknote.presenter

import android.content.Context
import com.android.quicknote.base.BasePresenter
import com.android.quicknote.data.repository.TaskRepository
import com.android.quicknote.view.MainView

class MainPresenter : BasePresenter<MainView>() {

    var repository: TaskRepository? = null

    override fun attachView(view: MainView) {
        super.attachView(view)
        repository = TaskRepository(view as Context)
    }
}