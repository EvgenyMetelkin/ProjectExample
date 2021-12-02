package com.example.project_example.business.domain.model

import com.example.project_example.business.domain.model.DataItem
import java.lang.Exception

object DataFactory {

    private val list = listOf<DataItem>()

    fun getData(): List<DataItem> = list

    fun getDataByNumber(number: Int ) = try {
        list[number]
    } catch (e: Exception) {
        list[0]
    }

}