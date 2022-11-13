package com.learningacademy.dagger2fullflashproject

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationInterface(): UserRegistrationInterface
}