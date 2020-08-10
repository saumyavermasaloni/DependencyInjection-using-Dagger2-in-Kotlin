package com.example.kotlin2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.FragmentManager
import android.app.FragmentTransaction
import com.example.kotlin2.MyApplication
import com.example.kotlin2.R
import com.example.kotlin2.di.component.DaggerActivityComponent
import com.example.kotlin2.di.modules.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

public class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel:MainViewModel

    @Inject
    lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerActivityComponent
                .builder()
                .applicationComponent((applicationContext as MyApplication).component)
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        setContentView(R.layout.activity_main)

        loadFragment()

        tv1.setText(homeViewModel.getSomeData());
    }

    fun loadFragment()
    {
        var fragmentManager:FragmentManager=getFragmentManager()
        var fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()

        var homeFragment = HomeFragment();
        fragmentTransaction.add(R.id.frame_layout,homeFragment)
        fragmentTransaction.commit()
    }
}
