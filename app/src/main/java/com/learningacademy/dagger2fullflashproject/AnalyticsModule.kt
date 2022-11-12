package com.learningacademy.dagger2fullflashproject

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService() : AnalyticsService{
        return MixPanel()
    }
}