package com.vikas.myapplicationusingdagger.di

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ApplicationContext
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityContext
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DatabaseName
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DatabaseVersion
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class NetworkApiKey
