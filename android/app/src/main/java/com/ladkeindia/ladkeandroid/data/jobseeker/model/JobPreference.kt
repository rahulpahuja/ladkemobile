package com.ladkeindia.ladkeandroid.data.jobseeker.model

data class JobPreference(var job_id:String, var domains:Array<String>,
                         var preferredJobLocation:Array<Location>, var preferredSalaryRange:String,
                         var preferedSkills:Array<Skill>
)