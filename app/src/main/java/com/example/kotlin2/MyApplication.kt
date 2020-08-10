package com.example.kotlin2

import android.app.Application
import android.util.Log
import com.example.kotlin2.di.component.ApplicationComponent
import com.example.kotlin2.di.component.DaggerApplicationComponent
import com.example.kotlin2.di.modules.ApplicationModule
import com.example.kotlin2.resources.DatabaseService
import com.example.kotlin2.resources.NetworkService
import com.example.kotlin2.utils.NetworkHelper
import javax.inject.Inject

class MyApplication :Application(){

    @Inject
    lateinit var databaseService:DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var networkHelper: NetworkHelper

    lateinit var component:ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component=DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        component.inject(this)

        Log.e("error",networkService.toString())
    }
}