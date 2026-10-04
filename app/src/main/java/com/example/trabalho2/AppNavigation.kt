package com.example.trabalho2

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {

            NavigationBar {

                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate(Rotas.HOME)
                    },
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Início"
                        )
                    },
                    label = {
                        Text("Início")
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate(Rotas.RESTAURANTES)
                    },
                    icon = {
                        Icon(
                            Icons.Default.Restaurant,
                            contentDescription = "Restaurantes"
                        )
                    },
                    label = {
                        Text("Restaurantes")
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate(Rotas.CATEGORIAS)
                    },
                    icon = {
                        Icon(
                            Icons.Default.Category,
                            contentDescription = "Categorias"
                        )
                    },
                    label = {
                        Text("Categorias")
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate(Rotas.FAVORITOS)
                    },
                    icon = {
                        Icon(
                            Icons.Default.Favorite,
                            contentDescription = "Favoritos"
                        )
                    },
                    label = {
                        Text("Favoritos")
                    }
                )
            }
        }
    ) { paddingValues ->

        NavHost(
            navController = navController,
            startDestination = Rotas.HOME
        ) {

            composable(Rotas.HOME) {
                TelaHome(
                    navController = navController,
                    paddingValues = paddingValues
                )
            }

            composable(Rotas.RESTAURANTES) {
                TelaRestaurantes(
                    navController = navController,
                    paddingValues = paddingValues
                )
            }

            composable(Rotas.CATEGORIAS) {
                TelaCategorias(
                    navController = navController,
                    paddingValues = paddingValues
                )
            }

            composable(Rotas.FAVORITOS) {
                TelaFavoritos(
                    navController = navController,
                    paddingValues = paddingValues
                )
            }

            composable(Rotas.SOBRE) {
                TelaSobre(
                    navController = navController,
                    paddingValues = paddingValues
                )
            }

            composable(
                route = Rotas.DETALHE_RESTAURANTE,
                arguments = listOf(
                    navArgument("id") {
                        type = NavType.IntType
                    }
                )
            ) { backStackEntry ->

                val id = backStackEntry.arguments?.getInt("id")

                if (id != null) {
                    TelaDetalheRestaurante(
                        id = id,
                        navController = navController,
                        paddingValues = paddingValues
                    )
                }
            }

            composable(
                route = Rotas.DETALHE_CATEGORIA,
                arguments = listOf(
                    navArgument("id") {
                        type = NavType.IntType
                    }
                )
            ) { backStackEntry ->

                val id = backStackEntry.arguments?.getInt("id")

                if (id != null) {
                    TelaDetalheCategoria(
                        id = id,
                        navController = navController,
                        paddingValues = paddingValues
                    )
                }
            }
        }
    }
}
