package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Inicio(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier.padding(paddingValues = innerPadding)
        ) {
            Text(
                text = "¡Bienvenido a tu Biblioteca! Descubre, aprende y reserva tus libros favoritos."
            )
            Button(
                onClick = {
                    navController.navigate(route = "lista")
                }
            ) {
                Text(text = "Ver Libros")
            }

            Button(
                onClick = {
                    navController.navigate(route = "misReservas")
                }
            ) {
                Text(text = "Mis Reservas")
            }
        }
    }
}