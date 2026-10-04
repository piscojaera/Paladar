package com.example.trabalho2

data class Restaurante(
    val id: Int,
    val nome: String,
    val nota: Double,
    val preco: String,
    val categoriaId: Int,
    val descricao: String,
    val favorito: Boolean = false
)

data class Categoria(
    val id: Int,
    val nome: String,
    val descricao: String
)