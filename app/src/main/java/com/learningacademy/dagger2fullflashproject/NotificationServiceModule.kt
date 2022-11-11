package com.learningacademy.dagger2fullflashproject

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @Named ("message")
    @Provides                 // provide means it provides the object of required dependency
    fun getMessageService():NotificationService{
        return MessageService()
    }

    @Named ("email")                // named qualifier
    @Provides                 // provide means it provides the object of required dependency
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}