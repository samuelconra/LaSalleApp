package com.samuelconra.lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.samuelconra.lasalleapp.R
import com.samuelconra.lasalleapp.ui.components.CardImage
import com.samuelconra.lasalleapp.ui.components.Widget
import com.samuelconra.lasalleapp.ui.theme.LaSalleAppTheme
import com.samuelconra.lasalleapp.utils.*

@Composable
fun HomeScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
    ){
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background",
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 80.dp),
                contentScale = ContentScale.Crop
            )
            Row (
                modifier = Modifier.padding(top = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
            ){
                //Logo
                Image(
                    painter =  painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(70.dp)
                )

                //Usuario
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(1f),
                ) {
                    Text(
                        text = stringResource(id = R.string.welcome_text),
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.titleSmall,
                    )
                    Text(
                        text = "Samuel Conde",
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.titleMedium,
                    )
                }

                //Icono
                Icon(
                    imageVector = Logout,
                    contentDescription = "Logout",
                    modifier = Modifier.size(30.dp),
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

        }

        // Caja con widgets
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-60).dp)
                .padding(horizontal = 24.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .height(140.dp),
            contentAlignment = Alignment.Center
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ){
                Widget(icon = Icons.Default.DateRange, title = "Sin Eventos")
                Widget(icon = Task, title = "2 Tareas")
                Widget(icon = Cash, title = "Pagos")
            }
        }

        // Body
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .background(MaterialTheme.colorScheme.background)
        ){
            Column(){
                Text(
                    text = stringResource(id = R.string.news_text),
                    style = MaterialTheme.typography.headlineSmall,
                )

                // Carrusel
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    items(newsList){ news ->
                        CardImage(news){
                            navController.navigate(Screens.NewsDetail.route + "/${news.id}")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))
                // Título de Comunidad
                Text(
                    text = stringResource(id = R.string.community),
                    style = MaterialTheme.typography.headlineSmall,
                )

                // Grid de Comunidad
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                ){
                    items(communities){
                        Box(
                            modifier = Modifier
                                .size(180.dp)
                                .padding(16.dp)
                        ){
                            AsyncImage(
                                model = it.image,
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize(),
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun HomeScreenPreview() {
    LaSalleAppTheme {
        val navController = rememberNavController()
        HomeScreen(PaddingValues(0.dp), navController)
    }
}