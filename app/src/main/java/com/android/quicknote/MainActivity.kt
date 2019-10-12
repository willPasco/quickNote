package com.android.quicknote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.quicknote.R
import com.android.quicknote.presenter.MainPresenter
import com.android.quicknote.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attachView(this)
    }
}
