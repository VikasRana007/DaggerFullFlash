package com.learningacademy.dagger2fullflashproject

import android.util.Log
import com.learningacademy.dagger2fullflashproject.Constants.TAG
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(to:String,from:String,body:String){
        Log.d(TAG, "Email Sent: ")
    }
}