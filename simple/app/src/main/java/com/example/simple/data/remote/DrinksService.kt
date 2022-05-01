package com.example.simple.data.remote

import com.example.simple.data.remote.response.CategoriesDTO
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface DrinksService {

    companion object {
        const val BASE_URL = "https://www.thecocktaildb.com"
        const val QUERY_PARAM = "c"

    }

    @GET("/api/json/v1/1/list.php")
    suspend fun getAllCategories(@Query(QUERY_PARAM) type: String = "list"): CategoriesDTO


}

//
//Api: https://www.thecocktaildb.com/api.php
//
//
//
//
//
//
//
//When the application starts there is a list of categories.
//
//[
//
//www.thecocktaildb.com/api/json/v1/1/list.php?c=list
//
//]
//
//
//
//Selecting a category will give you a drink list of that category
//
//[
//
//www.thecocktaildb.com/api/json/v1/1/filter.php?c=Ordinary_Drink
//
//]
//
//
//
//Selecting a drink will give you the details of the drink
//
//[
//
//By Id: www.thecocktaildb.com/api/json/v1/1/lookup.php?i=11007
//
//
//
//OR
//
//
//
//By name: www.thecocktaildb.com/api/json/v1/1/search.php?i=vodka
//
//]