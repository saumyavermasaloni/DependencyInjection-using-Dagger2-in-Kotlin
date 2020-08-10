package com.example.kotlin2.di.component

import com.example.kotlin2.di.modules.ActivityModule
import com.example.kotlin2.di.scope.ActivityScope
import com.example.kotlin2.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class],modules = [ActivityModule::class])
public interface ActivityComponent {

    fun inject(activity: MainActivity)
}