package com.example.kotlin2.di.component

import com.example.kotlin2.di.modules.ActivityModule
import com.example.kotlin2.di.modules.FragmentModule
import com.example.kotlin2.di.scope.ActivityScope
import com.example.kotlin2.di.scope.FragmentScope
import com.example.kotlin2.ui.HomeFragment
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class],modules = [FragmentModule::class])
public interface FragmentComponent {

    fun inject(homeFragment: HomeFragment)
}