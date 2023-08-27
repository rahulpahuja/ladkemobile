package com.ladkeindia.ladkeandroid.data.jobseeker.model

data class JobSeeker (var id:String,
                      var name:String,
                      var age:Int,
                      var currentLocation: Location,
                      val nativeLocation: Location,
                      var previousJobDetials: Array<JobDetail>,
                      var jobPreference: JobPreference,
                      var skills:Array<Skill>
)