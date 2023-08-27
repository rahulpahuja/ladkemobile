package com.ladkeindia.ladkeandroid.data.jobseeker

data class JobPreference(var job_id:String,var domains:Array<String>,
                         var preferredJobLocation:Array<JobLocation>,var preferredSalaryRange:String,
                         var preferedSkills:Array<Skill>
)