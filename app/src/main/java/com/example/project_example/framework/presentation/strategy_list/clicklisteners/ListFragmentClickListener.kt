package com.example.project_example.framework.presentation.strategy_list.clicklisteners

import com.example.project_example.business.domain.model.DataItem

interface ListFragmentClickListener {
    fun onClickFavorites(dataItem: DataItem)
    fun onClickGoToDetails(dataItem: DataItem)
}