package com.android.quicknote.android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.quicknote.R
import com.android.quicknote.android.viewholder.TaskListViewHolder
import com.android.quicknote.data.entity.TaskEntity

class TaskListRecyclerAdapter(private var taskList: List<TaskEntity>) :
    RecyclerView.Adapter<TaskListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.task_item, parent, false)
        return TaskListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: TaskListViewHolder, position: Int) {
        val model = taskList[position]
        holder.bind(model)
    }

}
