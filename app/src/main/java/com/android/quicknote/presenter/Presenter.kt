package com.android.quicknote.presenter

import com.android.quicknote.base.BaseView

interface Presenter<T : BaseView> {

    fun attachView(view: T)

}
