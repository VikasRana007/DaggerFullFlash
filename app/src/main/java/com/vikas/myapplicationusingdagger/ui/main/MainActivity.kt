package com.vikas.myapplicationusingdagger.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vikas.myapplicationusingdagger.MyApplication
import com.vikas.myapplicationusingdagger.R
import com.vikas.myapplicationusingdagger.di.module.ActivityModule
import com.vikas.myapplicationusingdagger.ui.home.HomeFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(
            this,
            viewModel.getSomeData(),
            Toast.LENGTH_LONG
        ).show()

        addHomeFragment()
    }

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit()
        }
    }


    @Suppress("DEPRECATION")
    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}