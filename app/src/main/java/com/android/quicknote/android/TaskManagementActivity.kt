package com.android.quicknote.android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.quicknote.R
import com.android.quicknote.presenter.TaskManagementPresenter
import com.android.quicknote.view.TaskManagementView
import kotlinx.android.synthetic.main.activity_task_management.*

class TaskManagementActivity : AppCompatActivity(), TaskManagementView {

    private var presenter = TaskManagementPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_management)

        presenter.attachView(this)
    }

    override fun dbRequestSuccess() {
        finish()
    }

    override fun dbRequestError() {}

    fun saveRecord(view: View) {

        val taskTitle = edit_task_title.text.toString()
        presenter.insertTask(taskTitle)

    }

}
