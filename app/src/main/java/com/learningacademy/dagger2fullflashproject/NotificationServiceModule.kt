package com.learningacademy.dagger2fullflashproject

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides                 // provide means it provides the object of required dependency
    fun getMessageService():NotificationService{
        return MessageService()
    }
}