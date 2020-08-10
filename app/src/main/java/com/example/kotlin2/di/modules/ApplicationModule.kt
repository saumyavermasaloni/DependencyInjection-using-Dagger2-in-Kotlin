package com.example.kotlin2.di.modules

import android.content.Context
import com.example.kotlin2.MyApplication
import com.example.kotlin2.di.qualifier.*
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
public class ApplicationModule constructor(private var application:MyApplication) {


    @ApplicationContext
    @Provides
    fun getApplicationContext():Context=application

    @DatabaseServiceInfo
    @Provides
   fun providedbname():String="1234"

    @NetworkServiceInfo
    @Provides
    fun key():String="4321"

    @NetworkHelperInfo
    @Provides
    fun NetworkConnected():Boolean=false
}