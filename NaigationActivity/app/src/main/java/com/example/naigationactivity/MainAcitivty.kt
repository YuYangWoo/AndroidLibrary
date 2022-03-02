package com.example.naigationactivity

import android.os.Bundle
import com.example.library.NavigationActivity
import com.example.naigationactivity.databinding.ActivityMainBinding

class MainAcitivty : NavigationActivity<ActivityMainBinding>(R.layout.activity_main, R.id.fragment) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initToolBar()
    }

    private fun initToolBar() {
        setSupportActionBar(binding.toolbar)
    }
}