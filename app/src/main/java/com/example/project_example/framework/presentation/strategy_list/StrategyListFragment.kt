package com.example.project_example.framework.presentation.strategy_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.project_example.framework.presentation.tabs.TabsViewModel


class StrategyListFragment : Fragment() {

    private var viewModel: TabsViewModel? = null


    fun setViewModel(viewModel: TabsViewModel) {
        this.viewModel = viewModel
    }

    companion object {
        private const val ARG_IS_FAVORITE = "ARG_IS_FAVORITE"

        @JvmStatic
        fun newInstance(isFavorite: Boolean): StrategyListFragment {
            return StrategyListFragment().apply {
                arguments = Bundle().apply {
                    putBoolean(ARG_IS_FAVORITE, isFavorite)
                }
            }
        }
    }
}