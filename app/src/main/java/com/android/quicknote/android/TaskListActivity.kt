package com.android.quicknote.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.quicknote.R
import com.android.quicknote.android.adapter.TaskListRecyclerAdapter
import com.android.quicknote.data.entity.TaskEntity
import com.android.quicknote.presenter.TaskListPresenter
import com.android.quicknote.view.TaskListView
import kotlinx.android.synthetic.main.activity_main.*

class TaskListActivity : AppCompatActivity(), TaskListView {

    private val presenter = TaskListPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attachView(this)
        presenter.getAllTasks()

        recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    override fun showData(taskList: List<TaskEntity>?) {
        Log.i("test", taskList.toString())

        recycler_view.adapter = TaskListRecyclerAdapter(taskList)
    }

    fun goToInsertScreen(view: View) {
        val intent = Intent(this, TaskManagementActivity::class.java)
        startActivity(intent)
    }

}
