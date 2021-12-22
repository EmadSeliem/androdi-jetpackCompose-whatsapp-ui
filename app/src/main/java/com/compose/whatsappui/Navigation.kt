package com.compose.whatsappui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.Screen
import com.compose.whatsappui.ui.chat.ChatActivity

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.ContactScreen.route) {
        composable(route = Screen.ContactScreen.route) {
ChatActivity()
        }
    }
}