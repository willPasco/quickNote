package com.android.quicknote.presenter

import com.android.quicknote.view.BaseView

interface Presenter<T : BaseView> {

    fun attachView(view: T)

}
