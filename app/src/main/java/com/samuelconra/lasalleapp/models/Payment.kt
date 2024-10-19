package com.samuelconra.lasalleapp.models

data class Payment(
    val code: Int,
    val period: String,
    val dueDate: String,
    val status: PaymentStatus
)

enum class PaymentStatus {
    PAID,
    PENDING,
    OVERDUE
}