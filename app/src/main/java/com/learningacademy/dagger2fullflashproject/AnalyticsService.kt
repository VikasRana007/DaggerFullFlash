package com.learningacademy.dagger2fullflashproject

import android.util.Log
import com.learningacademy.dagger2fullflashproject.Constants.TAG

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class MixPanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.i(TAG, "MixPanel - $eventName - $eventType")
    }

}

class FirebaseAnalytics : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.i(TAG, "MixPanel - $eventName - $eventType")
    }

}