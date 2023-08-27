package com.ladkeindia.ladkeandroid.data.jobseeker

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobSeeker


@Dao
interface JobSeekerDao {

    @Insert
    fun addJobSeeker(jobSeeker: JobSeeker)

    @Update
    fun updateJobSeeker(jobSeeker: JobSeeker)

    @Delete
    fun deleteJobSeeker(jobSeeker: JobSeeker)

    @Query("Select * from JobSeeker where id=:jobSeekerId")
    fun getJobSeeker(jobSeekerId: String)
}