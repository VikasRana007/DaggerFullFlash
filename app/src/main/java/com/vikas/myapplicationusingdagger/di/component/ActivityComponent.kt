package me.amitshekhar.dagger.learning.di.component

import com.vikas.myapplicationusingdagger.di.ActivityScope
import com.vikas.myapplicationusingdagger.di.module.ActivityModule
import com.vikas.myapplicationusingdagger.ui.main.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}
