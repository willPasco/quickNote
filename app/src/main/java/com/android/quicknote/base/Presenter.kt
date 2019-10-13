package com.android.quicknote.base

interface Presenter<T : BaseView> {

    fun attachView(view: T)

}
