package com.example.kotlin2.ui

import com.example.kotlin2.resources.DatabaseService
import com.example.kotlin2.resources.NetworkService
import com.example.kotlin2.utils.NetworkHelper
import javax.inject.Inject

public class HomeViewModel @Inject constructor(databaseService: DatabaseService,networkService: NetworkService,networkHelper:NetworkHelper){

    private var databaseService: DatabaseService=databaseService
    private var networkService:NetworkService=networkService
    private var networkHelper:NetworkHelper=networkHelper

    fun getSomeData():String=databaseService.getData()+" "+networkService.getData()+" "+networkHelper.isNetworkConnected()

}