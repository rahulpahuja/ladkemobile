//
//  DataModels.swift
//  LadkeiOS
//
//  Created by Apple on 28/08/23.
//

import Foundation

struct JobSeeker{
    var id:String
    var name:String
    var age:Int
    var currentLocation:Location
    var nativeLocation:Location
    var prevJobDetails:[JobDetails]
    var jobPreference:JobPreference
    var skills:[Skill]
}


struct JobPreference{
    var id:String
    var domain:[String]
    var preferredSalaryRange:String
    var preferredJobLocation:Location
    var skils:[Skill]
}

struct JobDetails{
    var job_id:String
    var organziation:String
    var domain:String
    var jobLocation: Location
    var salary:String
    var startDate: Date
    var endDate:Date
}

struct Skill{
    var id:String
    var name:String
    var domain:String
}

struct Location{
    var city:String
    var state:String
    var country:String
}
