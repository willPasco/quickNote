package com.android.quicknote.view

import com.android.quicknote.base.BaseView
import com.android.quicknote.data.entity.TaskEntity

interface TaskListView : BaseView {

    fun showData(data: List<TaskEntity>?)
}