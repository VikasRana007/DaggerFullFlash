package com.learningacademy.dagger2fullflashproject

import android.os.Bundle
import android.widget.Toast
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

        // this is manually
//         val userRepository = UserRepository()
//         val emailService = EmailService()
//        val userRegistrationService = UserRegistrationService(userRepository,emailService)

        // this is done by Dagger.
        val component = DaggerUserRegistrationInterface.builder().build()
        val userRegistrationService = component.getUserRegistration()
        userRegistrationService.userRegistration("vicay0001@gmail.com", "12345678890")


        val userService = component.getEmailService()
        userService.send("xyz","abc", "This Project of Vikas Rana")
        Toast.makeText(this, "This is Service Email", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "User data saved successfully.", Toast.LENGTH_SHORT).show()


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