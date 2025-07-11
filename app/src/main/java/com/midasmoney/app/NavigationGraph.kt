package com.midasmoney.app

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.midasmoney.screen.analytics.AnalyticsContentImp
import com.midasmoney.screen.goals.GoalsContentImp
import com.midasmoney.screen.history.HistoryContentImp
import com.midasmoney.screen.home.HomeContentImp
import com.midasmoney.screen.profile.ProfileContentImp

sealed class Screen(val route: String) {
    data object Home : Screen("Home")
    data object Analytics : Screen("Analytics")
    data object History : Screen("History")
    data object Goals : Screen("Goals")
    data object Profile : Screen("Profile")
}

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) { HomeContentImp() }
        composable(Screen.Analytics.route) { AnalyticsContentImp() }
        composable(Screen.History.route) { HistoryContentImp() }
        composable(Screen.Goals.route) { GoalsContentImp() }
        composable(Screen.Profile.route) { ProfileContentImp() }
    }
}