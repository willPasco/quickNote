package com.android.quicknote.presenter

import com.android.quicknote.view.BaseView

open class BasePresenter<T : BaseView>: Presenter<T> {

    open lateinit var view: T

    override fun attachView(view: T) {
        this.view = view
    }
}