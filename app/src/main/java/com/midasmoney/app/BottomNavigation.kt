package com.midasmoney.app

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.ArtTrack
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.capitalize
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        Screen.Home to Pair(Screen.Home.route, Icons.Filled.Home),
        Screen.Analytics to Pair(Screen.Analytics.route, Icons.Filled.Analytics),
        Screen.History to Pair(Screen.History.route, Icons.Filled.History),
        Screen.Goals to Pair(Screen.Goals.route, Icons.Filled.ArtTrack),
        Screen.Profile to Pair(Screen.Profile.route, Icons.Filled.Person)
    )

    NavigationBar {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route ?: ""

        items.forEach { (screen, item) ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = rememberVectorPainter(item.second),
                        contentDescription = item.first
                    )
                },
                label = { Text(item.first) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}