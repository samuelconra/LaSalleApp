package com.samuelconra.lasalleapp.models

data class Student(
    val name: String,
    val firstSurname: String,
    val secondSurname: String,
    val email: String,
    val career: String,
    val enrollment: Int,
    val subjects: List<Subject>
) {
    val average: Double
        get() = if (subjects.isNotEmpty()) {
            subjects.sumOf { it.average } / subjects.size
        } else {
            0.0
        }
}