package com.ladkeindia.ladkeandroid.data.jobseeker.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

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
data class Location(var city:String, var state:String, var country:String)
data class Skill(var id:String, var name:String, var domain:String)
data class JobPreference(var job_id:String, var domains:Array<String>,
                         var preferredJobLocation:Array<Location>, var preferredSalaryRange:String,
                         var preferedSkills:Array<Skill>)

data class JobDetail(var job_id:String, var organziation:String, var domain:String,
                     var jobLocation: Location, var salary:String, var startDate: Date, var endDate: Date,
)