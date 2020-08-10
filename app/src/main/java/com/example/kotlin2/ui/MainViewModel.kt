package com.example.kotlin2.ui

import com.example.kotlin2.di.scope.ActivityScope
import com.example.kotlin2.resources.DatabaseService
import com.example.kotlin2.resources.NetworkService
import javax.inject.Inject

@ActivityScope
public class MainViewModel @Inject constructor(private var databaseService: DatabaseService,
                                        private var networkService: NetworkService) {

    fun getSomeData():String = databaseService.getData()+" "+networkService.getData()
}