package com.finpay.sdk.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import androidx.navigation.Navigation
//import androidx.navigation.ui.AppBarConfiguration
//import androidx.navigation.ui.NavigationUI
import com.finpay.sdk.R
//import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.app_bar.*

class IndexActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        //intent to scan activity
//        iv_scan.setOnClickListener {
//            startActivity(Intent(applicationContext, ScanActivity::class.java))
//        }

//        val navView = findViewById<BottomNavigationViewEx>(R.id.bottom_navigation_main)
//        navView.enableAnimation(false)
//        navView.enableShiftingMode(false)
//        navView.enableItemShiftingMode(false)
//
//        setSupportActionBar(toolbar)
//        val appBarConfiguration = AppBarConfiguration.Builder(
//            R.id.nav_home,
//            R.id.nav_deals,
//            R.id.nav_finance,
//            R.id.nav_profile
//        ).build()
//
//        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
//        NavigationUI.setupWithNavController(navView, navController)

    }
}