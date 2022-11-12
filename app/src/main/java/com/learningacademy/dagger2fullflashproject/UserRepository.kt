package com.learningacademy.dagger2fullflashproject

import android.util.Log
import com.learningacademy.dagger2fullflashproject.Constants.TAG
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email:String,password:String){}
}

@ApplicationScope
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in SQL DB")
    }
}

class FirebaseRepository : UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in Firebase DB")
    }
}