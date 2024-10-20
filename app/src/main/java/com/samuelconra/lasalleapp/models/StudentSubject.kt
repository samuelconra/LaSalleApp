package com.samuelconra.lasalleapp.models

import kotlin.math.round

data class StudentSubject(
    val id: Int,
    val subject: Subject,
    val midterms: List<Midterm>,
) {
    val average: Double
        get() = round(((midterms[0].grade * 0.2) + (midterms[1].grade * 0.2) + (midterms[2].grade * 0.6)) * 10) / 10
}