package com.example.simple.data.remote.response

data class CategoriesDTO(
    val drinks: List<Drink>
) {
    data class Drink(
        val strCategory: String
    )
}

