package com.ladkeindia.ladkeandroid.data.jobseeker

data class NativeLocation(
    override var city: String,
    override var state: String,
    override var country: String
): Location