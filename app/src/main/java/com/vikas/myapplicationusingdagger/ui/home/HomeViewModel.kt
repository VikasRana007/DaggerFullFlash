package com.vikas.myapplicationusingdagger.ui.home

import com.vikas.myapplicationusingdagger.data.local.DatabaseService
import com.vikas.myapplicationusingdagger.data.local.FileStorageService
import com.vikas.myapplicationusingdagger.data.remote.NetworkService
import com.vikas.myapplicationusingdagger.di.FragmentScope
import javax.inject.Inject

@FragmentScope
class HomeViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService,
    private val fileStorageService1: FileStorageService,
    private val fileStorageService2: FileStorageService,
) {
    fun getSomeData(): String {
        return " databaseService : " + databaseService.getDummyData() + "\n" +
                " databaseServiceHashCode : " + databaseService.hashCode() + "\n" +
                " networkService : " + networkService.getDummyData() + "\n" +
                " networkServiceHashCode : " + networkService.hashCode() + "\n" +
                " fileStorageService1HashCode : " + fileStorageService1.hashCode() + "\n" +
                " fileStorageService2HashCode : " + fileStorageService2.hashCode()
    }
}