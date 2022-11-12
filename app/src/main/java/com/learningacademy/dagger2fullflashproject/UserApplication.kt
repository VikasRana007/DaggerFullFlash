package com.learningacademy.dagger2fullflashproject

import android.app.Application


class UserApplication : Application() {
    lateinit var userRegistrationInterface: UserRegistrationInterface

    override fun onCreate() {
        super.onCreate()
        userRegistrationInterface = DaggerUserRegistrationInterface.factory().create(3)

    }
}