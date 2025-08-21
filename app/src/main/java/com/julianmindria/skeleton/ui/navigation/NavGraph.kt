package com.julianmindria.skeleton.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.julianmindria.skeleton.ui.screens.settings.SettingsScreen

sealed interface Route {
    data object Home : Route
    data object Settings : Route
}

@Composable
fun AppNavGraph() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = "home") {
        composable("home") { HomeScreen(onOpenSettings = { nav.navigate("settings") }) }
        composable("settings") { SettingsScreen(onBack = { nav.popBackStack() }) }
    }
}

@Composable
fun HomeScreen(onOpenSettings: () -> Unit) {
    androidx.compose.material3.Button(onClick = onOpenSettings) {
        androidx.compose.material3.Text("Open Settings")
    }
}