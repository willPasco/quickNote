package com.android.quicknote.data.repository

import android.content.Context
import com.android.quicknote.data.dao.QuickNoteDao
import com.android.quicknote.data.db.QuickNoteDatabase

class MainRepository(context: Context) {

    private var dao: QuickNoteDao = QuickNoteDatabase.getDatabase(context).quickNoteDao()

}