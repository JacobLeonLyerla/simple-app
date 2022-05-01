package com.example.simple.di

import com.example.simple.data.remote.DrinksService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun drinksService(): DrinksService {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(DrinksService.BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            ).build()
        return retrofit.create(DrinksService::class.java)
    }


}