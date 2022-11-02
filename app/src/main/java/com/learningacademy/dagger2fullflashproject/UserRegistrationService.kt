package com.learningacademy.dagger2fullflashproject

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
// this @Inject annotation tell us when you need the object of
// this class you can call the constructor of this class
    private val userRepository: UserRepository,
    private val emailService: NotificationService,
) {
    //  Now we have to use manual dependency Injection. by passing these commented object to the constructor of UserRegistrationClass
    //    private val userRepository = UserRepository()
    //    private val emailService = EmailService()
    //    It's called constructor dependency injection...


    // in case of using dagger we need to tell dagger that we need that specific
    // object to use. and Dagger will create this particular object for us.
    // now the Question is how Dagger knows that how to make required object for this
    // we need to tell dagger ==>
    // 1. how to create(produce) a object .
    // 2. where to use(consume) that object.
    // that's all.
    // And this whole process will done by 3 thing in the dagger Consumer,Component, producer(constructor, module, fields)

    fun userRegistration(email: String, password: String) {
        userRepository.saveUser(email, password)
//        emailService.send(email, "vicay0001@gmail.com", "User Registered")
    }

}