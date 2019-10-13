package com.android.quicknote.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.quicknote.R
import com.android.quicknote.data.entity.TaskEntity
import com.android.quicknote.presenter.TaskListPresenter
import com.android.quicknote.view.TaskListView

class TaskListActivity : AppCompatActivity(), TaskListView {

    private val presenter = TaskListPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attachView(this)
        presenter.getAllTasks()
    }

    override fun showData(data: List<TaskEntity>?) {
        Log.i("test", data.toString())
    }

    fun goToInsertScreen(view: View) {
        val intent = Intent(this, TaskManagementActivity::class.java)
        startActivity(intent)
    }

}
