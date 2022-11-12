package com.learningacademy.dagger2fullflashproject

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @Named ("message")
    @Provides                 // provide means it provides the object of required dependency
    fun getMessageService(retryCount : Int):NotificationService{     //  here we requested to dagger to pass the retry count
                                                                   // value  here for that we have created factory
        return MessageService(retryCount)                      // this is how dagger provide us value on run time to pass with constructor.
    }

    @Named ("email")                // named qualifier
    @Provides                 // provide means it provides the object of required dependency
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}