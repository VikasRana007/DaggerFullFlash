package com.learningacademy.dagger2fullflashproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.learningacademy.dagger2fullflashproject.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

//    @Inject
//    lateinit var userService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        // this is done by Dagger.
        val component = DaggerUserRegistrationInterface.builder().build()

        // now we are using inject method of component interface  to get the instance of following
        component.inject(this)
        userRegistrationService.userRegistration("vicay0001@gmail.com", "12345678890")

    }


}