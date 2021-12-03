package com.example.project_example.framework.di.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.project_example.framework.di.main.keys.MainViewModelKey
import com.example.project_example.framework.presentation.main.multifeature.MainViewModelFactory
import com.example.project_example.framework.presentation.tabs.TabsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule{

    @Binds
    abstract fun bindViewModelFactory(factory: MainViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @MainViewModelKey(TabsViewModel::class)
    internal abstract fun bindTabsViewModel(viewModel: TabsViewModel): ViewModel

}