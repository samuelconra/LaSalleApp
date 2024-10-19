package com.samuelconra.lasalleapp.models

import kotlin.math.round

data class Student(
    val name: String,
    val firstSurname: String,
    val secondSurname: String,
    val birth: String,
    val email: String,
    val career: String,
    val semester: Int,
    val enrollment: Int,
    val subjects: List<StudentSubject>,
    val payments: List<Payment>
) {
    val average: Double
        get() = if (subjects.isNotEmpty()) {
            round((subjects.sumOf { it.average } / subjects.size) * 10) / 10
        } else {
            0.0
        }

    val passedSubjects: Int
        get() = subjects.count { it.average >= 6.0 }

    val failedSubjects: Int
        get() = subjects.count { it.average < 6.0 }

    val fullName: String
        get() = "$name $firstSurname $secondSurname"
}