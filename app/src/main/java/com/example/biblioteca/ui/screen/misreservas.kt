package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.biblioteca.ui.data.listaLibros
import com.example.biblioteca.ui.data.listaReservas
import com.example.biblioteca.ui.section.ReservaCard

@Composable
fun MisReservas(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp)
        ) {
            Text(text = "Mis Reservas")
            Text(text = "Lista de reservas activas")

            listaReservas.forEach { reserva ->
                val libro = listaLibros.find { it.nombre == reserva.nombreLibro }

                if (libro != null) {
                    ReservaCard(
                        nombreLibro = reserva.nombreLibro,
                        imagenRes = libro.imagenRes,
                        fechaReserva = reserva.fechaReserva,
                        estado = reserva.estado,
                        onVerReserva = {
                            navController.navigate(
                                route = "detalleReserva/${reserva.nombreLibro}/${reserva.fechaReserva}/${reserva.codigoReserva}"
                            )
                        }
                    )
                }
            }
        }
    }
}