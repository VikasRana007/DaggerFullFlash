package com.learningacademy.dagger2fullflashproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.learningacademy.dagger2fullflashproject.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    @Inject
    lateinit var userService : NotificationService

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

//        these two lines used while using construction injection in previous branch
//        val userRegistrationService = component.getUserRegistration()
//        val userService = component.getEmailService()


        // now we are using inject method of component interface  to get the instance of following
        component.inject(this)
        userRegistrationService.userRegistration("vicay0001@gmail.com", "12345678890")
        userService.send("xyz","abc", "This Project of Vikas Rana")
        Toast.makeText(this, "This is Service Email", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "User data saved successfully.", Toast.LENGTH_SHORT).show()

    }


}