package com.samuelconra.lasalleapp.models

import kotlin.math.round

data class Midterm(
    val name: String,
    val assignments: Double,
    val activities: Double,
    val project: Double,
    val exam: Double
){
    val grade: Double
        get() = round((((assignments * 0.1) + (activities * 0.1) + (project * 0.3) + (exam * 0.5))) * 10) / 10
}
