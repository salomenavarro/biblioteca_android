package com.example.biblioteca.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ReservaCard(
    nombreLibro: String,
    imagenRes: Int,
    fechaReserva: String,
    estado: String,
    onVerReserva: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = imagenRes),
                contentDescription = nombreLibro,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
            )

            Column(
                modifier = Modifier.padding(start = 12.dp)
            ) {
                Text(text = "Libro: $nombreLibro")
                Text(text = "Fecha: $fechaReserva")
                Text(text = "Estado: $estado")
            }
        }

        Button(
            onClick = onVerReserva,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Ver Reserva")
        }
    }
}