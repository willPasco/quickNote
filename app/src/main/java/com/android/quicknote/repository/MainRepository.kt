package com.android.quicknote.repository

import android.content.Context
import com.android.quicknote.dao.QuickNoteDao
import com.android.quicknote.db.QuickNoteDatabase

class MainRepository(context: Context) {

    private var dao: QuickNoteDao = QuickNoteDatabase.getDatabase(context).quickNoteDao()

}