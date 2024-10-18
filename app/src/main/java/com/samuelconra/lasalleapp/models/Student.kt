package com.samuelconra.lasalleapp.models

data class Student(
    val name: String,
    val firstSurname: String,
    val secondSurname: String,
    val birth: String,
    val email: String,
    val career: String,
    val semester: Int,
    val enrollment: Int,
    val subjects: List<StudentSubject>
) {
    val average: Double
        get() = if (subjects.isNotEmpty()) {
            subjects.sumOf { it.average } / subjects.size
        } else {
            0.0
        }

    val fullName: String
        get() = "$name $firstSurname $secondSurname"
}