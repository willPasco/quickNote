package com.android.quicknote.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.quicknote.R
import com.android.quicknote.presenter.TaskManagementPresenter
import com.android.quicknote.view.TaskManagementView

class TaskManagementActivity : AppCompatActivity(), TaskManagementView {

    private var presenter = TaskManagementPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_management)

        presenter.attachView(this)
    }
}
