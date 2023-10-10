package com.vikas.myapplicationusingdagger.data.local

import android.content.Context
import com.vikas.myapplicationusingdagger.di.ApplicationContext
import com.vikas.myapplicationusingdagger.di.DatabaseName
import com.vikas.myapplicationusingdagger.di.DatabaseVersion
import javax.inject.Inject

@ApplicationContext
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName : String,
    @DatabaseVersion private val databaseVersion : Int) {

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}