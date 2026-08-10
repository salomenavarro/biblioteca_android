package com.example.biblioteca.ui.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.biblioteca.ui.screen.Confirmacion
import com.example.biblioteca.ui.screen.Detalles
import com.example.biblioteca.ui.screen.Inicio
import com.example.biblioteca.ui.screen.Lista

@Composable
fun Navegation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {
        composable(route = "inicio") {
            Inicio(navController)
        }
        composable(route = "lista") {
            Lista(navController)
        }
        composable(route = "detalle/{nombre}") { backstack ->
            val nombre = backstack.arguments?.getString("nombre")
            Detalles(navController, nombre)
        }
        composable(route = "confirmacion/{nombre}") { backstack ->
            val nombre = backstack.arguments?.getString("nombre")
                Confirmacion(navController, nombre)
        }
    }
}