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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelconra.lasalleapp.R
import com.samuelconra.lasalleapp.models.Payment
import com.samuelconra.lasalleapp.models.PaymentStatus
import com.samuelconra.lasalleapp.utils.Check
import com.samuelconra.lasalleapp.utils.Close
import com.samuelconra.lasalleapp.utils.ExclamationCircle

@Composable
fun PaymentCard(payment: Payment) {
    val colorStatus: Color
    val icon: ImageVector

    if (payment.status == PaymentStatus.OVERDUE){
        colorStatus = MaterialTheme.colorScheme.surface
        icon = ExclamationCircle
    }
    else if (payment.status == PaymentStatus.PENDING){
        colorStatus = MaterialTheme.colorScheme.onSurfaceVariant
        icon = Close
    }
    else {
        colorStatus = MaterialTheme.colorScheme.surfaceVariant
        icon = Check
    }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .fillMaxWidth()
            .background(colorStatus)
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
                Column(modifier = Modifier.weight(0.7f)) {
                    Text(
                        text = stringResource(id = R.string.period_text),
                        style = MaterialTheme.typography.labelMedium,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                    Text(
                        text = payment.period,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(id = R.string.dueDate_text),
                        style = MaterialTheme.typography.labelMedium,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSecondary,
                    )
                    Text(
                        text = payment.dueDate,
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