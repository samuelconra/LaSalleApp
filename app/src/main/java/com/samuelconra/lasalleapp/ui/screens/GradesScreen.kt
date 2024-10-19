package com.samuelconra.lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.samuelconra.lasalleapp.R
import com.samuelconra.lasalleapp.ui.components.InfoSubject
import com.samuelconra.lasalleapp.utils.Screens
import com.samuelconra.lasalleapp.utils.student

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(horizontal = 20.dp)
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        // Título Página
        Text(
            text = stringResource(id = R.string.grades_text),
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 32.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 60.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))

        // Info Estudiante
        Text(
            text = "${student.name} ${student.firstSurname}",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
        )
        Text(
            text = student.career,
            style = MaterialTheme.typography.labelMedium,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(30.dp))


        // Información Materias
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            //Materias Aprobadas
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(25.dp))
                    .background(MaterialTheme.colorScheme.tertiaryContainer)
                    .size(110.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "${student.passedSubjects}",
                    style = MaterialTheme.typography.displaySmall,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = stringResource(id = R.string.passed_text),
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onTertiaryContainer,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                )
            }
            //Materias Reprobadas
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(25.dp))
                    .background(MaterialTheme.colorScheme.tertiary)
                    .size(110.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "${student.failedSubjects}",
                    style = MaterialTheme.typography.displaySmall,
                    color = MaterialTheme.colorScheme.onSecondary,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = stringResource(id = R.string.failed_text),
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onTertiary,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                )
            }
            // Promedio
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(25.dp))
                    .background(MaterialTheme.colorScheme.tertiary)
                    .size(110.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "${student.average}",
                    style = MaterialTheme.typography.displaySmall,
                    color = MaterialTheme.colorScheme.onSecondary,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = stringResource(id = R.string.average_text),
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onTertiary,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))


        // Lista Materias
        Text(
            text = stringResource(id = R.string.subjects_text),
            style = MaterialTheme.typography.titleSmall,
            fontSize = 22.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn(
            modifier = Modifier
                .padding(bottom = 60.dp)
                .clip(RoundedCornerShape(25.dp))
                .weight(1f)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onPrimary)
        ){
            items(student.subjects){ studentSubject ->
                InfoSubject(studentSubject){
                    navController.navigate(Screens.GradesDetail.route + "/${it.id}")
                }
            }
        }
    }
}