package com.learningacademy.dagger2fullflashproject

import dagger.Component

@Component
interface UserRegistrationInterface {

    fun getUserRegistration() : UserRegistrationService

    fun getEmailService() : EmailService
}