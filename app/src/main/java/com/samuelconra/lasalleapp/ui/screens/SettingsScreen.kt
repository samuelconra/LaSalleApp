package com.samuelconra.lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.samuelconra.lasalleapp.R
import com.samuelconra.lasalleapp.ui.theme.poppinsFontFamily
import com.samuelconra.lasalleapp.utils.Logout
import com.samuelconra.lasalleapp.utils.Screens
import com.samuelconra.lasalleapp.utils.student

@Composable
fun SettingsScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(innerPadding)
            .padding(horizontal = 30.dp)
            .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        // Logout Icon
        Row{
            Spacer(modifier = Modifier.weight(1F))
            Icon(
                imageVector = Logout,
                contentDescription = "Logout",
                modifier = Modifier.size(40.dp),
                tint = MaterialTheme.colorScheme.primary,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        // Profile Picture
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .size(200.dp),
            contentAlignment = Alignment.Center
        ){

        }
        Spacer(modifier = Modifier.height(20.dp))

        // Información Principal
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(
                text = "${student.name} ${student.firstSurname}",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSecondary,
            )
            Text(
                text = student.email,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
            )
        }
        Spacer(modifier = Modifier.height(40.dp))

        // Información Usuario
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .padding(20.dp)
        ){
            Text(
                text = stringResource(id = R.string.general_data),
                style = MaterialTheme.typography.titleSmall,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(6.dp))

            Row{
                Text(
                    text = stringResource(id = R.string.name_text),
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = student.fullName,
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 16.sp
                )
            }
            Row{
                Text(
                    text = stringResource(id = R.string.birth_text),
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = student.birth,
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 16.sp
                )
            }
            Row{
                Text(
                    text = stringResource(id = R.string.enrollment_text),
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = student.enrollment.toString(),
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 16.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(60.dp))

        // Botones de Acceso
        Column(horizontalAlignment = Alignment.CenterHorizontally,) {

            ElevatedButton(
                onClick = { navController.navigate(Screens.ChangePassword.route) },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface),
                modifier = Modifier
                    .height(50.dp)
                    .width(300.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 4.dp,
                    disabledElevation = 4.dp
                )
            ) {
                Text(
                    text = stringResource(id = R.string.change_passwd_text),
                    style = MaterialTheme.typography.titleSmall,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onPrimary,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            ElevatedButton(
                onClick = { navController.navigate(Screens.ChangeTheme.route) },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onSurface),
                modifier = Modifier
                    .height(50.dp)
                    .width(300.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 4.dp,
                    disabledElevation = 4.dp
                )
            ) {
                Text(
                    text = stringResource(id = R.string.change_theme_text),
                    style = MaterialTheme.typography.titleSmall,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onPrimary,
                )
            }
        }
    }
}