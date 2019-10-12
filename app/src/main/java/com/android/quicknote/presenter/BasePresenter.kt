package com.android.quicknote.presenter

import android.content.Context
import com.android.quicknote.dao.QuickNoteDao
import com.android.quicknote.db.QuickNoteDatabase
import com.android.quicknote.repository.MainRepository
import com.android.quicknote.view.BaseView

open class BasePresenter {

    private val repository = MainRepository()
    private lateinit var view: BaseView
    private var dao: QuickNoteDao? = null

    fun attachView(view: BaseView){
        this.view = view
        val context = view as Context
        QuickNoteDatabase.getDatabase(context)
    }
}