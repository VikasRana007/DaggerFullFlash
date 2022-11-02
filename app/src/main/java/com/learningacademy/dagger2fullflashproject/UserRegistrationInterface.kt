package com.learningacademy.dagger2fullflashproject

import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationInterface {

//    fun getUserRegistration() : UserRegistrationService

//    fun getEmailService() : EmailService

    // no need of above two function to tell dagger to create that object...
    fun inject(mainActivity: MainActivity)
}