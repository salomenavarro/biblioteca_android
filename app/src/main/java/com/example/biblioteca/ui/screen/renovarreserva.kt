package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.biblioteca.ui.data.listaLibros

@Composable
fun RenovarReserva(
    navController: NavHostController,
    nombreLibro: String?,
    fechaReserva: String?
) {
    val libro = listaLibros.find { it.nombre == nombreLibro }
    var fechaNueva by remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Renovar Reserva")

            if (libro != null) {
                Image(
                    painter = painterResource(id = libro.imagenRes),
                    contentDescription = libro.nombre,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                )

                Text(text = "Libro: ${libro.nombre}")
                Text(text = "Reserva Actual: $fechaReserva")

                OutlinedTextField(
                    value = fechaNueva,
                    onValueChange = { fechaNueva = it },
                    label = { Text(text = "Nueva Fecha (dd-mm-aaaa)") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                )

                Button(
                    onClick = {
                        navController.navigate(
                            route = "renovacionExitosa/${libro.nombre}/$fechaNueva"
                        )
                    },
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Text(text = "Confirmar Renovación")
                }
            } else {
                Text(text = "Reserva no encontrada")
            }
        }
    }
}