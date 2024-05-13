package com.nusantara.bajuadatapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object About: Screen("about")
    data object Detail: Screen("detail_bajuadat")
}