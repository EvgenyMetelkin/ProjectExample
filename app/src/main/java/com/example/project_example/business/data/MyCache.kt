package com.example.project_example.business.data

interface MyCache {

    fun getFavoriteIds(): MutableSet<String>

    fun addFavorite(id: String)

    fun removeFavorite(id: String)
}