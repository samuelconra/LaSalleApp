package com.samuelconra.lasalleapp.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun EvaluationItem(name: String, grade: Double){
    Row(
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = name,
            style = MaterialTheme.typography.labelLarge,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onSecondary,
        )
        Text(
            text = grade.toString(),
            style = MaterialTheme.typography.labelLarge,
            fontSize = 20.sp,
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
        )
    }
}