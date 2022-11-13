package com.learningacademy.dagger2fullflashproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learningacademy.dagger2fullflashproject.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val appComponent = (application as UserApplication).appComponent
        val userRegistrationInterface = DaggerUserRegistrationInterface.factory().create(3,appComponent)
        userRegistrationInterface.inject(this)
        userRegistrationService.userRegistration("vicay0001@gmail.com", "1234567890")

    }


}