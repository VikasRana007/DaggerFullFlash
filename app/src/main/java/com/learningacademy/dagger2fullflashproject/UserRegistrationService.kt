package com.learningacademy.dagger2fullflashproject

class UserRegistrationService(private val userRepository: UserRepository, private val emailService: EmailService) {
    //  Now we have to use manual dependency Injection. by passing these commented object to the constructor of UserRegistrationClass
      //    private val userRepository = UserRepository()
      //    private val emailService = EmailService()
      //    It's called constructor dependency injection...

    fun userRegistration(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "vicay0001@gmail.com", "User Registered")
    }

}