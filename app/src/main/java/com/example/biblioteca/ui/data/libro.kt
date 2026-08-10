package com.example.biblioteca.ui.data

import com.example.biblioteca.R

data class Libro(
    val nombre: String,
    val autor: String,
    val categoria: String,
    val descripcion: String,
    val imagenRes: Int
)

val listaLibros = listOf(
    Libro(
        nombre = "Dune",
        autor = "Frank Herbert",
        categoria = "Ciencia Ficción",
        descripcion = "Una obra maestra sobre política, religión y supervivencia en el planeta desértico Arrakis.",
        imagenRes = R.drawable.dune
    ),
    Libro(
        nombre = "Cien años de soledad",
        autor = "Gabriel García Márquez",
        categoria = "Realismo Mágico",
        descripcion = "La fascinante historia de la familia Buendía a lo largo de siete generaciones en el pueblo de Macondo.",
        imagenRes = R.drawable.cien_soledad
    ),
    Libro(
        nombre = "El arte de la guerra",
        autor = "Sun Tzu",
        categoria = "Estrategia",
        descripcion = "Un antiguo tratado sobre táctica, resolución de conflictos y toma de decisiones aplicable a la vida diaria.",
        imagenRes = R.drawable.arte_guerra
    ),
    Libro(
        nombre = "El conde de Montecristo",
        autor = "Alexandre Dumas",
        categoria = "Novela Clásica",
        descripcion = "Una épica historia sobre traición, prisión, venganza y redención ambientada en el siglo XIX.",
        imagenRes = R.drawable.monte_cristo
    )
)