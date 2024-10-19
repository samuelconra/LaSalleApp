package com.samuelconra.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelconra.lasalleapp.models.StudentSubject

@Composable
fun InfoSubject(subjectStudent: StudentSubject, onClick: (StudentSubject) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 25.dp)
            .clickable(onClick = { onClick(subjectStudent) }),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.CenterVertically)
    {
        Icon(
            imageVector = subjectStudent.subject.icon,
            contentDescription = subjectStudent.subject.name,
            modifier = Modifier.size(20.dp),
            tint = MaterialTheme.colorScheme.onSecondary,
        )
        Text(
            text = subjectStudent.subject.name,
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = subjectStudent.average.toString(),
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSecondary
        )
    }
    Spacer(
        modifier = Modifier
            .height(1.dp)
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .background(MaterialTheme.colorScheme.tertiary)
    )
}