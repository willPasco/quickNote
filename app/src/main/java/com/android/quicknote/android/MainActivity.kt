package com.android.quicknote.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.quicknote.R
import com.android.quicknote.data.entity.TaskEntity
import com.android.quicknote.presenter.MainPresenter
import com.android.quicknote.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attachView(this)
    }

    override fun showData(data: List<TaskEntity>?) {
        Log.i("test", data.toString())
    }

    fun goToInsertScreen(view: View) {
        val intent = Intent(this, TaskManagementActivity::class.java)
        startActivity(intent)
    }

}
