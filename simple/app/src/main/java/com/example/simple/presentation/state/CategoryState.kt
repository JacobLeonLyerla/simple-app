package com.example.simple.presentation.state

data class CategoryState(
    val categories: List<String> = emptyList(),
    val isLoading: Boolean = false,
    val errorMsg: String? = null
)
