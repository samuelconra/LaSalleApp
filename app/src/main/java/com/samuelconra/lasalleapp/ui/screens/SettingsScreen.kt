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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.samuelconra.lasalleapp.ui.theme.poppinsFontFamily
import com.samuelconra.lasalleapp.utils.Logout

@Composable
fun SettingsScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(innerPadding)
            .padding(horizontal = 30.dp),
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
                text = "Samuel Conde",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSecondary,
            )
            Text(
                text = "scr77164@lasallebajio.edu.mx",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
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
                text = "Datos Generales",
                style = MaterialTheme.typography.titleSmall,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(6.dp))

            Row{
                Text(
                    text = "Nombre:",
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Samuel Conde Rangel",
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 16.sp
                )
            }
            Row{
                Text(
                    text = "Fecha de Nacimiento:",
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "14-10-2004",
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 16.sp
                )
            }
            Row{
                Text(
                    text = "Matrícula",
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "77164",
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 16.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(60.dp))

        // Botones de Acceso
        Column(horizontalAlignment = Alignment.CenterHorizontally,) {

            ElevatedButton(
                onClick = { },
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
                    text = "Cambiar Contraseña",
                    style = MaterialTheme.typography.titleSmall,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onPrimary,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            ElevatedButton(
                onClick = { },
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
                    text = "Cambiar Tema",
                    style = MaterialTheme.typography.titleSmall,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onPrimary,
                )
            }
        }
    }
}