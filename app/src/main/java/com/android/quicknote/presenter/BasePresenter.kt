package com.android.quicknote.presenter

import android.content.Context
import com.android.quicknote.dao.QuickNoteDao
import com.android.quicknote.repository.MainRepository
import com.android.quicknote.view.BaseView

open class BasePresenter {

    private var repository: MainRepository? = null
    private lateinit var view: BaseView

    fun attachView(view: BaseView) {
        this.view = view
        repository = MainRepository(view as Context)
    }
}