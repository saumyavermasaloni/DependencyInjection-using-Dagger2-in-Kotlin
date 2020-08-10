package com.example.kotlin2.resources

import android.content.Context
import com.example.kotlin2.di.qualifier.ApplicationContext
import com.example.kotlin2.di.qualifier.DatabaseServiceInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
public class DatabaseService @Inject constructor(@ApplicationContext private var context: Context, @DatabaseServiceInfo private var dbname:String)
{
    fun getData():String="My name is"+dbname
}