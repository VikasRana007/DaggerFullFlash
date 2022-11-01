package com.learningacademy.dagger2fullflashproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.learningacademy.dagger2fullflashproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
         val userRepository = UserRepository()
         val emailService = EmailService()
        val userRegistrationService = UserRegistrationService(userRepository,emailService)
        userRegistrationService.userRegistration("vicay0001@gmail.com", "12345678890")

        /**
         * in the above class their is 4 common and very big problem as describes below
         * 1. Unit Testing not possible
         * 2. Violence of Single Responsibility
         * 3. Life time of these objects
         * 4. Extensibility & Scalability
         */

// Now we can use Dependency Injection to avoid these problems.
    }


}