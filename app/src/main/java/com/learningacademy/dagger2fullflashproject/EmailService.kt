package com.learningacademy.dagger2fullflashproject

import android.util.Log
import com.learningacademy.dagger2fullflashproject.Constants.TAG
import dagger.Provides
import javax.inject.Inject
interface NotificationService{
    fun send(to:String,from:String,body:String)
}


class EmailService @Inject constructor() : NotificationService  {
   override fun send(to:String,from:String,body:String){
        Log.d(TAG, "Email Sent: ")
    }
}

class MessageService(private val retryCount : Int) : NotificationService  {
    override fun send(to:String,from:String,body:String){
        Log.d(TAG, "Message Sent - retry count $retryCount")
    }
}