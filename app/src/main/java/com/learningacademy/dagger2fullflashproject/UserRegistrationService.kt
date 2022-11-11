package com.learningacademy.dagger2fullflashproject

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
   @Named("email") private val notificationService : NotificationService,) {

    fun userRegistration(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "vicay0001@gmail.com", "User Registered")
    }

}