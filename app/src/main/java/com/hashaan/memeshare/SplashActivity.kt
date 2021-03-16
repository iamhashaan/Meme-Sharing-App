package com.hashaan.memeshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val Splash_time = 1800
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



            Handler().postDelayed( {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }, Splash_time.toLong())
        }

        override fun onPause() {
            super.onPause()
            finish()
        }
    }

