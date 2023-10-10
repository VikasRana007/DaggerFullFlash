package com.vikas.myapplicationusingdagger.ui.main

import com.vikas.myapplicationusingdagger.data.local.DatabaseService
import com.vikas.myapplicationusingdagger.data.remote.NetworkService
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {
    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }
}