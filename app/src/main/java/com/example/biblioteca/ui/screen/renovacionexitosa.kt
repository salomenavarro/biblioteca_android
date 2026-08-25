package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun RenovacionExitosa(
    navController: NavHostController,
    nombreLibro: String?,
    fechaNueva: String?
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "✅ Reserva Renovada")
            Text(text = "Libro: $nombreLibro")
            Text(text = "Nueva Fecha: $fechaNueva")

            Button(
                onClick = {
                    navController.navigate(route = "misReservas") {
                        popUpTo(route = "misReservas") { inclusive = true }
                    }
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Volver a Mis Reservas")
            }
        }
    }
}