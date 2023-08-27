package com.ladkeindia.ladkeandroid.data.jobseeker

import java.util.Date

data class JobDetail(
    var job_id:String,
    var organziation:String,
    var domain:String,
    var jobLocation: JobLocation,
    var salary:String,
    var startDate: Date,
    var endDate:Date,
)