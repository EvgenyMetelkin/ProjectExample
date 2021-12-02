package com.example.project_example.framework.presentation.tabs

import com.example.project_example.business.domain.model.DataItem

/**
 * Defines the navigation actions that can be called from tab screen ViewModel.
 */
interface TabFragmentNavigator {
    fun goToDetails(dataItem: DataItem)
}