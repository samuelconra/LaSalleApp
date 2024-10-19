package com.samuelconra.lasalleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import com.samuelconra.lasalleapp.models.BottomNavigationItem
import com.samuelconra.lasalleapp.ui.screens.*
import com.samuelconra.lasalleapp.ui.theme.LaSalleAppTheme
import com.samuelconra.lasalleapp.utils.Screens

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            var selectedItem by rememberSaveable { mutableIntStateOf(0) }
            LaSalleAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        AnimatedNavigationBar(
                            selectedIndex = selectedItem,
                            modifier = Modifier.height(90.dp),
                            barColor = MaterialTheme.colorScheme.primary,
                            cornerRadius = shapeCornerRadius(34.dp)
                        ) {
                            BottomNavigationItem.items.forEachIndexed { index, item ->
                                Column(
                                    modifier = Modifier.fillMaxSize().clickable{
                                        selectedItem = index
                                        navController.navigate(item.route) {}
                                    },
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Icon(
                                        imageVector = item.icon,
                                        contentDescription = null,
                                        tint = if(selectedItem == index) MaterialTheme.colorScheme.onPrimary
                                                else MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f),
                                        modifier = Modifier.size(26.dp)
                                    )
                                    Text(
                                        text = item.title,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = if(selectedItem == index) MaterialTheme.colorScheme.onPrimary
                                                else MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f)
                                    )
                                }
                            }
                        }
                    }
                ) { innerPadding ->
                    NavHost(navController = navController, startDestination = Screens.Home.route) {
                        composable(Screens.Home.route) {
                            HomeScreen(innerPadding, navController)
                        }
                        composable(Screens.Grades.route){
                            GradesScreen(innerPadding)
                        }
                        composable(Screens.Settings.route){
                            SettingsScreen(innerPadding, navController)
                        }
                        composable(Screens.Calendar.route){
                            CalendarScreen(innerPadding)
                        }
                        composable(
                            route = Screens.NewsDetail.route + "/{newsId}",
                            arguments = listOf(
                                navArgument("newsId") {
                                    type = NavType.IntType
                                }
                            )
                        ){
                            val newsId = it.arguments?.getInt("newsId") ?: 0
                            NewsDetailScreen(innerPadding, newsId)
                        }

                        composable(Screens.ChangePassword.route){
                            ChangePasswdScreen(innerPadding)
                        }
                        composable(Screens.ChangeTheme.route){
                            ChangeThemeScreen(innerPadding)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    LaSalleAppTheme {
    }
}