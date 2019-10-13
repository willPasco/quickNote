package com.android.quicknote.base

import com.android.quicknote.presenter.Presenter

open class BasePresenter<T : BaseView>:
    Presenter<T> {

    open lateinit var view: T

    override fun attachView(view: T) {
        this.view = view
    }
}