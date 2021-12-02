package com.example.project_example.framework.presentation.tabs

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.viewpager.widget.ViewPager
import com.example.project_example.business.domain.model.DataItem
import com.example.project_example.databinding.FragmentTabBinding
import com.example.project_example.framework.presentation.main.multifeature.MainViewModelFactory
import com.google.android.material.tabs.TabLayout
import javax.inject.Inject

class TabFragment @Inject constructor(
    private val viewModelFactory: MainViewModelFactory
) : Fragment(), TabFragmentNavigator {

    private var fragmentTabBinding: FragmentTabBinding? = null

    val viewModel: TabsViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // viewModel !!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTabBinding = FragmentTabBinding.inflate(inflater, container, false)
        return fragmentTabBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("dasdas", "tab onViewCreated")
        val cntx = context ?: return
        val sectionsPagerAdapter = SectionsPagerAdapter(cntx, childFragmentManager, viewModel)
        val viewPager: ViewPager = fragmentTabBinding?.viewPager ?: return
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = fragmentTabBinding?.tabs ?: return
        tabs.setupWithViewPager(viewPager)
    }

    private fun navigateToDetails(dataItem: DataItem) = findNavController().navigate(
        TabFragmentDirections.action_tabFragment_to_detailsFragment(dataItem)
    )

    override fun goToDetails(dataItem: DataItem) {
        navigateToDetails(dataItem)
    }
}