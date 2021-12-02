package com.example.project_example.framework.presentation.tabs

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.project_example.R

class SectionsPagerAdapter(
    private val context: Context,
    fm: FragmentManager,
    private val viewModel: TabsViewModel
) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
    }

    override fun getPageTitle(position: Int): CharSequence {
    }

    override fun getCount(): Int {
    }
}