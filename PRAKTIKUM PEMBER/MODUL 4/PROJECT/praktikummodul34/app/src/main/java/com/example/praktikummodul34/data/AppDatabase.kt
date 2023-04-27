package com.example.praktikummodul34.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.praktikummodul34.data.dao.UserDao
import com.example.praktikummodul34.data.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object{
        private var instant: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase{
            if(instant==null){
                instant = Room.databaseBuilder(context, AppDatabase::class.java, "app-database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }

            return instant!!
        }
    }
}