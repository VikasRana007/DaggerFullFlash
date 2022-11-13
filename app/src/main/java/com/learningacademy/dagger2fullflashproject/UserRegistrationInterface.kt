package com.learningacademy.dagger2fullflashproject

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationInterface {
    fun inject(mainActivity: MainActivity)

    // in the factory concept all the dynamic values send by components as shown below
//    @Subcomponent.Factory
//    interface Factory {
//        fun create(
//            @BindsInstance retryCount: Int
//        ): UserRegistrationInterface
//    }

    fun getEmailService(): EmailService
}