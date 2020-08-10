package com.example.kotlin2.di.qualifier

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DatabaseServiceInfo {
}