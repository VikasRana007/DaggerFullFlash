package com.vikas.myapplicationusingdagger.di.module

import android.app.Activity
import android.content.Context
import com.vikas.myapplicationusingdagger.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }
}