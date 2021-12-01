package com.example.project_example.framework.app

import android.app.Application
import com.example.project_example.framework.di.ApplicationComponent
import com.example.project_example.framework.di.DaggerApplicationComponent

class BaseApplication : Application() {

    private var appComponent: ApplicationComponent = DaggerApplicationComponent
        .factory()
        .create(
            application = this,
            applicationContext = this
        )



    fun getAppComponent(): ApplicationComponent {
        return appComponent
    }

}