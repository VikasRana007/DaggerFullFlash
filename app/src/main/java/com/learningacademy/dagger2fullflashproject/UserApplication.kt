package com.learningacademy.dagger2fullflashproject

import android.app.Application


class UserApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
       appComponent = DaggerAppComponent.builder().build()
    }
}