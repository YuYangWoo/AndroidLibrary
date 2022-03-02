package com.example.naigationactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.NavigationActivity

class MainAcitivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NavigationActivity.longToast(this, "빠끄빠끄")
    }
}