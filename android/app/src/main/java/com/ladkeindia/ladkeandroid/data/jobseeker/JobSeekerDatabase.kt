package com.ladkeindia.ladkeandroid.data.jobseeker

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobSeeker

@Database(entities = [JobSeeker::class], version = 1, exportSchema = true)
abstract class JobSeekerDatabase:RoomDatabase() {

    abstract fun jobSeekerDao():JobSeekerDao
}