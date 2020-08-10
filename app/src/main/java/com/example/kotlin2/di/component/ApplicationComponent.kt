package com.example.kotlin2.di.component

import com.example.kotlin2.MyApplication
import com.example.kotlin2.di.modules.ApplicationModule
import com.example.kotlin2.resources.DatabaseService
import com.example.kotlin2.resources.NetworkService
import com.example.kotlin2.ui.MainActivity
import com.example.kotlin2.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
public interface ApplicationComponent {

    fun inject(application: MyApplication)

    fun getDatabaseService(): DatabaseService

    fun getNetworkService(): NetworkService

    fun getNetworkHelper():NetworkHelper
}