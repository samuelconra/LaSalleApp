package com.samuelconra.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelconra.lasalleapp.utils.Close

@Composable
fun PaymentCard(colorState: Color, icon: ImageVector) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .fillMaxWidth()
            .background(colorState)
    ){
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .clip(RoundedCornerShape(25.dp))
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.tertiary)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ){
                Column{
                    Text(
                        text = "Periodo",
                        style = MaterialTheme.typography.labelMedium,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                    Text(
                        text = "Diciembre",
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Vencimiento",
                        style = MaterialTheme.typography.labelMedium,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                    Text(
                        text = "15-12-2024",
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                }
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = MaterialTheme.colorScheme.onSecondary,
                )
            }
        }
    }
}