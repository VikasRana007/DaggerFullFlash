package com.learningacademy.dagger2fullflashproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learningacademy.dagger2fullflashproject.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var userService: EmailService

    @Inject
    lateinit var userService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        // this is done by Dagger.
//        val component = DaggerUserRegistrationInterface.factory().create(3)
        val component = (application as UserApplication).userRegistrationInterface
        userService = component.getEmailService()
//        val component2 = DaggerUserRegistrationInterface.factory().create(3)

        userService2 = component.getEmailService()

        // now we are using inject method of component interface  to get the instance of following
//        val component2 = DaggerUserRegistrationInterface.factory().create(3)
//        userService2 = component2.getEmailService()      // it means that these email service instance singleton only in the component scope ,
                                                    // it component create again and again then EmailService Component will also create new instance
                                                   // so by default these singleton instances are not application level singleton
                                                  // these are only component level singleton.

        // to make these instances up to the level of application we need to use @Scope Annotation.

        component.inject(this)
        userRegistrationService.userRegistration("vicay0001@gmail.com", "1234567890")

    }


}