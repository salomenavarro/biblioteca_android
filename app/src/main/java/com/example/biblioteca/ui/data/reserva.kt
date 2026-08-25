package com.example.biblioteca.ui.data

data class Reserva(
    val nombreLibro: String,
    val fechaReserva: String,
    val codigoReserva: String,
    val estado: String
)

val listaReservas = listOf(
    Reserva(
        nombreLibro = "Dune",
        fechaReserva = "15-06-2026",
        codigoReserva = "RES-2026-001",
        estado = "Activa"
    ),
    Reserva(
        nombreLibro = "Cien años de soledad",
        fechaReserva = "20-06-2026",
        codigoReserva = "RES-2026-002",
        estado = "Activa"
    ),
    Reserva(
        nombreLibro = "El arte de la guerra",
        fechaReserva = "22-06-2026",
        codigoReserva = "RES-2026-003",
        estado = "Activa"
    ),
    Reserva(
        nombreLibro = "El conde de Montecristo",
        fechaReserva = "25-06-2026",
        codigoReserva = "RES-2026-004",
        estado = "Activa"
    )
)