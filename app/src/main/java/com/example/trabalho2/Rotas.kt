package com.example.trabalho2

object Rotas {

    const val HOME = "home"

    const val RESTAURANTES = "restaurantes"

    const val CATEGORIAS = "categorias"

    const val FAVORITOS = "favoritos"

    const val SOBRE = "sobre"

    const val DETALHE_RESTAURANTE = "detalhe_restaurante/{id}"

    const val DETALHE_CATEGORIA = "detalhe_categoria/{id}"


    fun detalheRestaurante(id: Int): String {
        return "detalhe_restaurante/$id"
    }

    fun detalheCategoria(id: Int): String {
        return "detalhe_categoria/$id"
    }
}