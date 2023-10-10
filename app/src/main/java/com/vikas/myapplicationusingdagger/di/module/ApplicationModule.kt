package com.vikas.myapplicationusingdagger.di.module

import android.content.Context
import com.vikas.myapplicationusingdagger.MyApplication
import com.vikas.myapplicationusingdagger.data.local.FileStorageService
import com.vikas.myapplicationusingdagger.data.remote.HttpClient
import com.vikas.myapplicationusingdagger.di.ApplicationContext
import com.vikas.myapplicationusingdagger.di.ApplicationScope
import com.vikas.myapplicationusingdagger.di.DatabaseName
import com.vikas.myapplicationusingdagger.di.DatabaseVersion
import com.vikas.myapplicationusingdagger.di.NetworkApiKey
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @ApplicationScope
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideApiKey(): String = "SOME_API_KEY"

    @ApplicationScope
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }

}