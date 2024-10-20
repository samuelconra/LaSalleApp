package com.samuelconra.lasalleapp.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.samuelconra.lasalleapp.R
import com.samuelconra.lasalleapp.ui.components.EvaluationItem
import com.samuelconra.lasalleapp.ui.theme.*
import com.samuelconra.lasalleapp.utils.student

@Composable
fun GradesDetailScreen(innerPadding: PaddingValues, studentSubjectId: Int) {
    val studentSubject = student.subjects.first { it.id == studentSubjectId }
    var selectedPartial by remember { mutableStateOf(2) }
    val partials = listOf(
        "Primer Parcial" to 10.0,
        "Segundo Parcial" to 9.5,
        "Tercer Parcial" to 9.3
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = studentSubject.subject.name,
            style = MaterialTheme.typography.displaySmall,
            fontSize = 32.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 60.dp)
                .padding(horizontal = 16.dp)
        )
        Spacer(Modifier.height(30.dp))

        Text(
            text = "${studentSubject.average}",
            style = MaterialTheme.typography.displaySmall,
            fontSize = 48.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
        )
        Text(
            text = stringResource(R.string.average_text).uppercase(),
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 15.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
        )
        Spacer(Modifier.height(40.dp))

        // Parciales
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            studentSubject.midterms.forEachIndexed { index, midterm ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .animatePartialPosition(isSelected = (index == selectedPartial), index, selectedPartial)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .setBackgroundColor(selectedPartial, index)
                            .clickable {
                                selectedPartial = index
                            }
                            .padding(25.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                    ){
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ){
                            Text(
                                text = midterm.name,
                                style = MaterialTheme.typography.titleSmall,
                                fontSize = 24.sp,
                                color = MaterialTheme.colorScheme.onSecondary,
                            )
                            Text(
                                text = midterm.grade.toString(),
                                style = MaterialTheme.typography.bodyMedium,
                                fontSize = 24.sp,
                                textAlign = TextAlign.End,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Spacer(Modifier.height(20.dp))

                        EvaluationItem("Tareas", midterm.assignments)
                        EvaluationItem("Actividades", midterm.activities)
                        EvaluationItem("Proyecto", midterm.project)
                        EvaluationItem("Examen", midterm.exam)
                    }
                }
            }
        }
    }
}

@Composable
fun Modifier.animatePartialPosition(isSelected: Boolean, index: Int, selectedPartial: Int): Modifier {
    var baseOffset by remember { mutableStateOf(0f) }
    if (selectedPartial == 0) {
        baseOffset = when (index) {
            0 -> 160f
            1 -> 0f
            else -> 80f

        }
    }
    else if (selectedPartial == 1){
        baseOffset = when (index) {
            0 -> 0f
            1 -> 160f
            else -> 80f
        }
    }
    else{
        baseOffset = when (index) {
            0 -> 0f
            1 -> 80f
            else -> 160f
        }
    }

    val offset by animateFloatAsState(baseOffset)
    val zIndex by animateFloatAsState(if (isSelected) 1f else 0f)

    return this
        .offset(y = offset.dp)
        .zIndex(zIndex)
}

@Composable
fun Modifier.setBackgroundColor(selectedPartial: Int, index: Int): Modifier {
    var color by remember { mutableStateOf<Color?>(GrayContainer) }

    if (selectedPartial == 0) {
        color = when (index){
            0 -> GrayContainer3
            1 -> GrayContainer
            else -> GrayContainer2
        }
    }
    else if (selectedPartial == 1){
        color = when (index){
            0 -> GrayContainer
            1 -> GrayContainer3
            else -> GrayContainer2
        }
    }
    else{
        color = when (index){
            0 -> GrayContainer
            1 -> GrayContainer2
            else -> GrayContainer3
        }
    }

    return this
        .background(color = color!!, shape = RoundedCornerShape(40.dp))
}
