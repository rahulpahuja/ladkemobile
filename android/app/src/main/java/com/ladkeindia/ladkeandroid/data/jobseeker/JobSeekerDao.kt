package com.ladkeindia.ladkeandroid.data.jobseeker

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobSeeker


@Dao
interface JobSeekerDao {

    @Insert
    suspend fun addJobSeeker(jobSeeker: JobSeeker)

    @Update
    suspend fun updateJobSeeker(jobSeeker: JobSeeker)

    @Delete
    suspend fun deleteJobSeeker(jobSeeker: JobSeeker)

    @Query("Select * from JobSeeker where id=:jobSeekerId")
    fun getJobSeeker(jobSeekerId: String):LiveData<JobSeeker>

    @Query("Select * from JobSeeker")
    fun getAllJobSeeker():LiveData<List<JobSeeker>>
}