package com.ladkeindia.ladkeandroid.data.jobseeker

data class JobSeeker (var id:String,
                      var name:String,
                      var age:Int,
                      var currentLocation: CurrentLocation,
                      val nativeLocation: NativeLocation,
                      var previousJobDetials: Array<JobDetail>,
                      var jobPreference: JobPreference,
                      var skills:Array<Skill>
)