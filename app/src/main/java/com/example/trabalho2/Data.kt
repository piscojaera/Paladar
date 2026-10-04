package com.example.trabalho2

import androidx.compose.runtime.mutableStateListOf

val restaurantes = mutableStateListOf(
    Restaurante(
        id = 1,
        nome = "Carlo Ristorante",
        nota = 4.6,
        preco = "$$$",
        categoriaId = 1,
        descricao = "Restaurante italiano com ambiente sofisticado."
    ),
    Restaurante(
        id = 2,
        nome = "Mada Pizza & Vinho",
        nota = 4.4,
        preco = "$$$",
        categoriaId = 2,
        descricao = "Pizzaria com opções de pizzas e vinhos."
    )
)

val categorias = mutableStateListOf(
    Categoria(
        id = 1,
        nome = "Italiano",
        descricao = "Restaurantes especializados em culinária italiana."
    ),
    Categoria(
        id = 2,
        nome = "Pizza",
        descricao = "Restaurantes especializados em pizzas."
    ),
    Categoria(
        id = 3,
        nome = "Romântico",
        descricao = "Restaurantes indicados para encontros e ocasiões especiais."
    )
)