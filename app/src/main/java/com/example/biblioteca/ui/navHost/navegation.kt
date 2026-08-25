package com.example.biblioteca.ui.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.biblioteca.ui.screen.Confirmacion
import com.example.biblioteca.ui.screen.DetalleReserva
import com.example.biblioteca.ui.screen.Detalles
import com.example.biblioteca.ui.screen.Inicio
import com.example.biblioteca.ui.screen.Lista
import com.example.biblioteca.ui.screen.MisReservas
import com.example.biblioteca.ui.screen.RenovacionExitosa
import com.example.biblioteca.ui.screen.RenovarReserva
import com.example.biblioteca.ui.screen.ReservaCancelada

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

        // ---- Rutas nuevas: flujo de Reservas ----
        composable(route = "misReservas") {
            MisReservas(navController)
        }
        composable(route = "detalleReserva/{nombreLibro}/{fechaReserva}/{codigoReserva}") { backstack ->
            val nombreLibro = backstack.arguments?.getString("nombreLibro")
            val fechaReserva = backstack.arguments?.getString("fechaReserva")
            val codigoReserva = backstack.arguments?.getString("codigoReserva")
            DetalleReserva(navController, nombreLibro, fechaReserva, codigoReserva)
        }
        composable(route = "renovarReserva/{nombreLibro}/{fechaReserva}") { backstack ->
            val nombreLibro = backstack.arguments?.getString("nombreLibro")
            val fechaReserva = backstack.arguments?.getString("fechaReserva")
            RenovarReserva(navController, nombreLibro, fechaReserva)
        }
        composable(route = "renovacionExitosa/{nombreLibro}/{fechaNueva}") { backstack ->
            val nombreLibro = backstack.arguments?.getString("nombreLibro")
            val fechaNueva = backstack.arguments?.getString("fechaNueva")
            RenovacionExitosa(navController, nombreLibro, fechaNueva)
        }

        composable(route = "reservaCancelada/{nombreLibro}") { backstack ->
            val nombreLibro = backstack.arguments?.getString("nombreLibro")
            ReservaCancelada(navController, nombreLibro)
        }
    }
}