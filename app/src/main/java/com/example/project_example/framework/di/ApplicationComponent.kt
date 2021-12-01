package com.example.project_example.framework.di

import android.app.Application
import android.content.Context
import com.example.project_example.framework.di.core.CoreModule
import com.example.project_example.framework.di.main.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        CoreModule::class,
        SubComponentsModule::class
    ]
)
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            @BindsInstance applicationContext: Context
        ): ApplicationComponent
    }

    fun mainComponent(): MainComponent.Factory
}