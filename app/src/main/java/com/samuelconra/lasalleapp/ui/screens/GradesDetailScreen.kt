package com.samuelconra.lasalleapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.samuelconra.lasalleapp.utils.student

@Composable
fun GradesDetailScreen(innerPadding: PaddingValues, studentSubjectId: Int) {
    val studentSubject = student.subjects.first { it.id == studentSubjectId }
    Column(
        Modifier
            .fillMaxSize()
            .padding(innerPadding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = studentSubject.subject.name,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium,
        )
    }
}