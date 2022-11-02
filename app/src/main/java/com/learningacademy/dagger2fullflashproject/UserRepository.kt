package com.learningacademy.dagger2fullflashproject

import android.nfc.Tag
import android.util.Log
import com.learningacademy.dagger2fullflashproject.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in DB")
    }
}