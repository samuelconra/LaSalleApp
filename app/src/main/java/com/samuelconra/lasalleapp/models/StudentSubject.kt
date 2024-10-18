package com.samuelconra.lasalleapp.models

data class StudentSubject(
    val subject: Subject,
    val partial1: Double,
    val partial2: Double,
    val partial3: Double
) {
    val average: Double
        get() = (partial1 + partial2 + partial3) / 3
}