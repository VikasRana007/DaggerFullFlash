package com.vikas.myapplicationusingdagger.di.component
import android.content.Context
import com.vikas.myapplicationusingdagger.MyApplication
import com.vikas.myapplicationusingdagger.data.local.DatabaseService
import com.vikas.myapplicationusingdagger.data.local.FileStorageService
import com.vikas.myapplicationusingdagger.data.remote.NetworkService
import com.vikas.myapplicationusingdagger.di.ApplicationContext
import com.vikas.myapplicationusingdagger.di.ApplicationScope
import com.vikas.myapplicationusingdagger.di.module.ApplicationModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getFileStorageService(): FileStorageService

}
