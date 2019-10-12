package com.android.quicknote.repository

import android.content.Context
import com.android.quicknote.db.QuickNoteDatabase

class MainRepository(context: Context) {

    private var dao: QuickNoteDatabase = QuickNoteDatabase.getDatabase(context)

}