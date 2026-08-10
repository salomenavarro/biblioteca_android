package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
fun Detalles(navController: NavHostController, nombre: String?) {
    val libro = listaLibros.find { it.nombre == nombre }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (libro != null) {
                Image(
                    painter = painterResource(id = libro.imagenRes),
                    contentDescription = libro.nombre,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )

                Text(text = "Nombre: ${libro.nombre}")
                Text(text = "Autor: ${libro.autor}")
                Text(text = "Categoría: ${libro.categoria}")
                Text(text = "Descripción: ${libro.descripcion}")

                Button(
                    onClick = {
                        navController.navigate(route = "confirmacion/${libro.nombre}")
                    }
                ) {
                    Text(text = "Reservar Libro")
                }
            } else {
                Text(text = "Libro no encontrado")
            }
        }
    }
}