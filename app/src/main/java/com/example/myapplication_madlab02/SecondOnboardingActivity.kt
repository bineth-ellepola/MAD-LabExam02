package com.example.myapplication_madlab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondOnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding03) // your second onboarding XML

        val getStartedButton = findViewById<Button>(R.id.GetStart)

        // Navigate to Home / Main screen
        getStartedButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java) // replace with your home screen
            startActivity(intent)
            finish()
        }
    }
}
