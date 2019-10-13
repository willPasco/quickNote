package com.android.quicknote.presenter

import android.content.Context
import com.android.quicknote.base.BasePresenter
import com.android.quicknote.data.repository.MainRepository
import com.android.quicknote.view.MainView

class MainPresenter : BasePresenter<MainView>() {

    var repository: MainRepository? = null

    override fun attachView(view: MainView) {
        super.attachView(view)
        repository = MainRepository(view as Context)
    }
}