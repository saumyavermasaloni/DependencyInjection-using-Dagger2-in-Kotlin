package com.example.kotlin2.ui

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin2.MyApplication
import com.example.kotlin2.R
import com.example.kotlin2.di.component.DaggerFragmentComponent
import com.example.kotlin2.di.modules.FragmentModule
import javax.inject.Inject

public class HomeFragment:Fragment() {

    @Inject
    lateinit var homeViewModel:HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view:View = inflater.inflate(R.layout.fragment_1,container,false)

         DaggerFragmentComponent
             .builder()
             .applicationComponent((activity.applicationContext as MyApplication).component)
             .fragmentModule(FragmentModule(this))
             .build()
             .inject(this)

        return view;
    }
}