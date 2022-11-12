package com.learningacademy.dagger2fullflashproject

import android.util.Log
import com.learningacademy.dagger2fullflashproject.Constants.TAG
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email:String,password:String){}
}

@ApplicationScope
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in SQL DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository constructor(private val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in Firebase DB")
        analyticsService.trackEvent("Save User", "CREATE") 
    }
}