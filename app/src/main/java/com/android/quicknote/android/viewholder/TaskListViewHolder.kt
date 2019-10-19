package com.android.quicknote.android.viewholder

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.quicknote.R
import com.android.quicknote.data.entity.TaskEntity
import java.text.SimpleDateFormat

class TaskListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val taskTitle: TextView by lazy { view.findViewById<TextView>(R.id.text_view_task_title) }
    private val taskDescription: TextView by lazy { view.findViewById<TextView>(R.id.text_view_task_description) }
    private val taskDate: TextView by lazy { view.findViewById<TextView>(R.id.text_view_task_date) }

    fun bind(model: TaskEntity) {
        taskTitle.text = model.title ?: "-"
        taskDescription.text = model.description ?: "-"

        formatDate(model.id)
    }

    @SuppressLint("SimpleDateFormat")
    private fun formatDate(date: Long) {
        val formatter = SimpleDateFormat("MM/dd/yyyy - hh:mm")
        val formattedDate = formatter.format(date)
        val taskDateText = "Created in $formattedDate"

        taskDate.text = taskDateText

    }

}
