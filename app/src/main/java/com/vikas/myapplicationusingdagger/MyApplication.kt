package com.vikas.myapplicationusingdagger

import android.app.Application
import com.vikas.myapplicationusingdagger.data.local.DatabaseService
import com.vikas.myapplicationusingdagger.data.remote.NetworkService
import com.vikas.myapplicationusingdagger.di.component.ApplicationComponent
import com.vikas.myapplicationusingdagger.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {


    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}