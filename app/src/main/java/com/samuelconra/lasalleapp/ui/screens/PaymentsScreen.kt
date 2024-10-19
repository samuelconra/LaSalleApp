package com.samuelconra.lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelconra.lasalleapp.R
import com.samuelconra.lasalleapp.ui.components.PaymentCard
import com.samuelconra.lasalleapp.utils.Check
import com.samuelconra.lasalleapp.utils.Close
import com.samuelconra.lasalleapp.utils.ExclamationCircle

@Composable
fun PaymentsScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(horizontal = 20.dp)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Título Pagos
        Text(
            text = stringResource(id = R.string.payments_text),
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 32.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 60.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))

        // Pagos Pendientes
        Text(
            text = stringResource(id = R.string.payments_due_text),
            style = MaterialTheme.typography.titleSmall,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))

        PaymentCard(MaterialTheme.colorScheme.onSurfaceVariant, Close)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surface, ExclamationCircle)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surface, ExclamationCircle)
        Spacer(modifier = Modifier.height(30.dp))

        // Pagos Realizados
        Text(
            text = stringResource(id = R.string.payments_made_text),
            style = MaterialTheme.typography.titleSmall,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))

        PaymentCard(MaterialTheme.colorScheme.surfaceVariant, Check)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surfaceVariant, Check)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surfaceVariant, Check)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surfaceVariant, Check)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surfaceVariant, Check)
        Spacer(modifier = Modifier.height(10.dp))
        PaymentCard(MaterialTheme.colorScheme.surfaceVariant, Check)
        Spacer(modifier = Modifier.height(10.dp))
    }
}