package com.learningacademy.dagger2fullflashproject

import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationInterface {

    // no need of above two function to tell dagger to create that object... in case of using Inject function.
    fun inject(mainActivity: MainActivity)

  // in the factory concept all the dynamic values send by components as shown below
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount  : Int): UserRegistrationInterface
    }

    fun getEmailService():EmailService
}