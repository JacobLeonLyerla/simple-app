package com.example.simple.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.simple.domain.GetCategoryUseCase
import com.example.simple.presentation.state.CategoryState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val getCategoryUseCase: GetCategoryUseCase
): ViewModel() {
    val categoryState: LiveData<CategoryState> = liveData {
        emit(CategoryState(isLoading = true))
        val category = getCategoryUseCase()
        emit(CategoryState(categories=category, isLoading=false))
    }
}