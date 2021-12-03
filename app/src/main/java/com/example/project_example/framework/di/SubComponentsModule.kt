package com.example.project_example.framework.di

import com.example.project_example.framework.di.main.MainComponent
import dagger.Module

@Module(
    subcomponents = [
        MainComponent::class
    ]
)
class SubComponentsModule