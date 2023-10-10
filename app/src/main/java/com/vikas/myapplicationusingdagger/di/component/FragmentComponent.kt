package me.amitshekhar.dagger.learning.di.component

import com.vikas.myapplicationusingdagger.di.FragmentScope
import com.vikas.myapplicationusingdagger.di.module.FragmentModule
import com.vikas.myapplicationusingdagger.ui.home.HomeFragment
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: HomeFragment)

}
