package com.example.acestagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Switch from splash theme to original theme after app loads
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)
    }
}