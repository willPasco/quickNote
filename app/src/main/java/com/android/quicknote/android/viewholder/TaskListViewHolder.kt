package com.android.quicknote.android.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.quicknote.R
import com.android.quicknote.data.entity.TaskEntity

class TaskListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val taskTitle: TextView by lazy { view.findViewById<TextView>(R.id.text_view_task_title) }

    fun bind(model: TaskEntity) {
        taskTitle.text = model.title
    }

}
