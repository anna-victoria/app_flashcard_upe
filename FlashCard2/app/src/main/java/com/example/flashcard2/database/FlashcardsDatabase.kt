package com.example.flashcard2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CardsInfo::class], version = 1, exportSchema = false)
abstract class FlashcardsDatabase : RoomDatabase() {

    abstract val flashcardsDatabaseDao : FlashcardsDatabaseDao

    companion object{

        @Volatile
        private var INSTANCE: FlashcardsDatabase? = null

        fun getInstance(context: Context) : FlashcardsDatabase {
            synchronized(lock = this){
                var instance = INSTANCE

                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FlashcardsDatabase::class.java,
                        "sleep_history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}
