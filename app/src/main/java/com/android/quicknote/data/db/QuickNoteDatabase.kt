package com.android.quicknote.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.quicknote.data.dao.QuickNoteDao
import com.android.quicknote.data.entity.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class QuickNoteDatabase : RoomDatabase() {

    abstract fun quickNoteDao(): QuickNoteDao

    companion object {

        @Volatile
        private var INSTANCE: QuickNoteDatabase? = null

        fun getDatabase(context: Context): QuickNoteDatabase {
            val tempInstace = INSTANCE
            if (tempInstace != null) {
                return tempInstace
            }

            synchronized(this){
                val instace = Room.databaseBuilder(
                    context.applicationContext,
                    QuickNoteDatabase::class.java,
                    "quick_note_database")
                    .build()
                INSTANCE = instace
                return instace
            }
        }
    }
}