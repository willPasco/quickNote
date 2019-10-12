package com.android.quicknote.presenter

import com.android.quicknote.repository.MainRepository
import com.android.quicknote.view.BaseView

open class BasePresenter {

    private val repository = MainRepository()
    private lateinit var view: BaseView

    fun attachView(view: BaseView){
        this.view = view
    }
}