package com.samuelconra.lasalleapp.models

import kotlin.math.round

data class StudentSubject(
    val id: Int,
    val subject: Subject,
    val partial1: Double,
    val partial2: Double,
    val partial3: Double
) {
    val average: Double
        get() = round(((partial1 + partial2 + partial3) / 3) * 10) / 10
}