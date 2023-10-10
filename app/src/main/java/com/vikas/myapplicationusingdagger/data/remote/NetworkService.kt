package com.vikas.myapplicationusingdagger.data.remote

import android.content.Context
import com.vikas.myapplicationusingdagger.di.ApplicationScope
import com.vikas.myapplicationusingdagger.di.NetworkApiKey
import javax.inject.Inject

@ApplicationScope
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationScope private val context: Context,
    @NetworkApiKey private val networkApiKey: String,
) {
    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }
}