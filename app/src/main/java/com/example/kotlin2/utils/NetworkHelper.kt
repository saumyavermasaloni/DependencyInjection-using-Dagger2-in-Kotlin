package com.example.kotlin2.utils

import android.content.Context
import com.example.kotlin2.di.qualifier.ApplicationContext
import com.example.kotlin2.di.qualifier.NetworkHelperInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
public class NetworkHelper @Inject constructor(@ApplicationContext var context: Context,@NetworkHelperInfo var network:Boolean)
{
    fun isNetworkConnected():Boolean=network
}