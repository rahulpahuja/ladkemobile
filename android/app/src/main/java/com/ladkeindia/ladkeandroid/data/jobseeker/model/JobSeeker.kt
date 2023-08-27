package com.ladkeindia.ladkeandroid.data.jobseeker.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class JobSeeker (
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var name:String,
    var age:Int,
    var currentLocation: Location,
    val nativeLocation: Location,
    var previousJobDetials: Array<JobDetail>,
    var jobPreference: JobPreference,
    var skills:Array<Skill>
)