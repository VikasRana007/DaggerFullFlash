package com.learningacademy.dagger2fullflashproject

import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class],        // app component is added here because the UserRegistrationInterface have dependency pm AppComponent
    modules = [UserRepositoryModule::class,
        NotificationServiceModule::class])
interface UserRegistrationInterface {
    fun inject(mainActivity: MainActivity)

    // in the factory concept all the dynamic values send by components as shown below
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance retryCount: Int,
            appComponent: AppComponent,
        ): UserRegistrationInterface
    }

    fun getEmailService(): EmailService
}