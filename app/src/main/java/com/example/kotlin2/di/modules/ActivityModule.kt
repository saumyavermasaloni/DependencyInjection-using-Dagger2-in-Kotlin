package com.example.kotlin2.di.modules

import android.app.Activity
import android.content.Context
import com.example.kotlin2.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
public class ActivityModule constructor(private var activity: Activity){

    @ActivityContext
    @Provides
    fun provideContext(): Context=activity
}