package com.example.littlelemon

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
 import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        item {
            TopAppBar()
        }

        item {
            UpperPanel()
        }

        item {
            WeeklySpecialCard()
        }

        items(
            items = DishRepository.dishes,
            key = { it.id }
        ) { dish ->
            MenuDish(
                navController = navController,
                dish = dish
            )
        }
    }
}