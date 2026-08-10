package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Confirmacion(navController: NavHostController, nombre: String?) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp)
        ) {
            Text(text = "Reserva Exitosa :)")
            Text(text = "Libro: $nombre")
            Text(text = "Fecha: 15/06/2026")

            Button(
                onClick = {
                    navController.navigate(route = "inicio")
                }
            ) {
                Text(text = "Volver al Inicio ← ")
            }
        }
    }
}