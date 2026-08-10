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
import com.example.biblioteca.ui.section.BookCard

@Composable
fun Lista(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .padding(16.dp)
        ) {
            Text(text = "Mis Libros")
            Text(text = "Elige un libro para ver más detalles.")

            listaLibros.forEach { libro ->
                BookCard(
                    nombre = libro.nombre,
                    imagenRes = libro.imagenRes,
                    onVerDetalle = {
                        navController.navigate(route = "detalle/${libro.nombre}")
                    }
                )
            }
        }
    }
}