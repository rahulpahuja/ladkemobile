package com.ladkeindia.ladkeandroid.data.jobseeker

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobSeeker

@Database(entities = [JobSeeker::class], version = 1, exportSchema = true)
abstract class JobSeekerDatabase:RoomDatabase() {

    abstract fun jobSeekerDao():JobSeekerDao

    companion object{
        @Volatile
        private var instance: JobSeekerDatabase?= null
        fun getInstance(context: Context):JobSeekerDatabase{
            synchronized(this){
                if(instance == null){
                    instance = Room.databaseBuilder(context, JobSeekerDatabase::class.java, "jobSeekerDB").build()
                }
            }
            return instance!!
        }
    }
}