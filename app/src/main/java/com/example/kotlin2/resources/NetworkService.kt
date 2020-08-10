package com.example.kotlin2.resources

import android.content.Context
import com.example.kotlin2.di.qualifier.ApplicationContext
import com.example.kotlin2.di.qualifier.NetworkServiceInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
public class NetworkService @Inject constructor(@ApplicationContext private var context: Context,@NetworkServiceInfo private var key:String) {

    fun getData():String="Saumya"+key
}