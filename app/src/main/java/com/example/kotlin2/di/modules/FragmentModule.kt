package com.example.kotlin2.di.modules

import android.app.Fragment
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlin2.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

@Module
public class FragmentModule constructor(var fragment: Fragment){

  @RequiresApi(Build.VERSION_CODES.M)
  @FragmentScope
  @Provides
  fun provideFragmentContext(): Context=fragment.context

}