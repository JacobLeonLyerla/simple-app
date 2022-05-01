package com.example.simple.domain

import com.example.simple.data.DrinkRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    private val drinkRepo: DrinkRepo
) {
    suspend operator fun invoke(): List<String> = withContext(Dispatchers.IO) {
        drinkRepo.getCategories()
    }
}