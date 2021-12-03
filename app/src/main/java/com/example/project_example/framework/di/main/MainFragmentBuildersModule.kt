package com.example.project_example.framework.di.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.project_example.framework.di.main.keys.MainFragmentKey
import com.example.project_example.framework.presentation.main.multifeature.MainFragmentFactory
import com.example.project_example.framework.presentation.tabs.TabFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainFragmentBuildersModule {

    @Binds
    abstract fun bindFragmentFactory(mainFragmentFactory: MainFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @MainFragmentKey(TabFragment::class)
    abstract fun bindTabFragment(mainFragment: TabFragment): Fragment

}