package com.ladkeindia.ladkeandroid.data.jobseeker

import android.content.Context
import androidx.room.Room

class DatabaseSingleton {
    lateinit var instance: JobSeekerDatabase


     fun getInstance(context: Context):JobSeekerDatabase{
        if(instance == null){
            instance = Room.databaseBuilder(context, JobSeekerDatabase::class.java, "jobSeekerDB").build()
        }
        return instance
    }

}