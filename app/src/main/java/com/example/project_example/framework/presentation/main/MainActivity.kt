package com.example.project_example.framework.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.NavigationRes
import androidx.navigation.NavController
import com.example.project_example.R
import com.example.project_example.framework.presentation.main.multifeature.MainFragmentFactory
import com.example.project_example.framework.presentation.main.multifeature.MainNavController
import com.example.project_example.framework.presentation.main.multifeature.MainNavHostFragment

class MainActivity : AppCompatActivity(), MainNavController {

    private val TAG = "MainActivity"

    private var navController: NavController? = null
        get() {
            if (field == null) {
                Log.w(TAG, "NavController is NULL")
            }
            return field
        }

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            navMain()
        }
    }

    override fun navController() = navController

    override fun navMain() {
        createNavHost(
            R.navigation.nav_graph,
            MainFragmentFactory.FRAGMENT_FACTORY_NAME
        )
    }

    private fun createNavHost(@NavigationRes graphId: Int, fragmentFactoryName: String) {

        val newNavHostFragment = when (fragmentFactoryName) {

            MainFragmentFactory.FRAGMENT_FACTORY_NAME -> {
                MainNavHostFragment.create(
                    graphId
                )
            }

            // TODO: can add other hosts here

            else -> {
                MainNavHostFragment.create(
                    graphId
                )
            }
        }

        supportFragmentManager.beginTransaction()
            .replace(
                R.id.main_nav_host_container,
                newNavHostFragment,
                getString(R.string.NavHostFragmentTag)
            )
            .setPrimaryNavigationFragment(newNavHostFragment)
            .commit()
    }

    override fun setNavController(navController: NavController) {
        this.navController = navController
    }
}