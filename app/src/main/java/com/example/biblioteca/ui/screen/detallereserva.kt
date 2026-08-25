package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.biblioteca.ui.data.listaLibros

@Composable
fun DetalleReserva(
    navController: NavHostController,
    nombreLibro: String?,
    fechaReserva: String?,
    codigoReserva: String?
) {
    val libro = listaLibros.find { it.nombre == nombreLibro }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Detalle de Reserva")

            if (libro != null) {
                Image(
                    painter = painterResource(id = libro.imagenRes),
                    contentDescription = libro.nombre,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                )

                Text(text = "Nombre: ${libro.nombre}")
                Text(text = "Autor: ${libro.autor}")
                Text(text = "Fecha Reserva: $fechaReserva")
                Text(text = "Código Reserva: $codigoReserva")
                Text(text = "Estado: Activa")

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = {
                            navController.navigate(
                                route = "renovarReserva/${libro.nombre}/$fechaReserva"
                            )
                        }
                    ) {
                        Text(text = "Renovar Reserva")
                    }

                    Button(
                        onClick = {
                            navController.navigate(route = "reservaCancelada/${libro.nombre}")
                        }
                    ) {
                        Text(text = "Cancelar Reserva")
                    }
                }
            } else {
                Text(text = "Reserva no encontrada")
            }
        }
    }
}