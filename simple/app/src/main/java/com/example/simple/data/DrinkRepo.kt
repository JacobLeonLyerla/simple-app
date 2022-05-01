package com.example.simple.data

import com.example.simple.data.remote.DrinksService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DrinkRepo @Inject constructor(
    private val drinksService: DrinksService
) {
    suspend fun getCategories(): List<String> = withContext(Dispatchers.IO) {
        drinksService.getAllCategories().drinks.map { it.strCategory }
    }
}