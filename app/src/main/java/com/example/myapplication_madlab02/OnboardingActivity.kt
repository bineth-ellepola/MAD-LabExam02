package com.example.myapplication_madlab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbording02) // your first onboarding XML

        val nextButton = findViewById<Button>(R.id.Next)
        val skipButton = findViewById<Button>(R.id.Skip)

        // Navigate to second onboarding screen
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondOnboardingActivity::class.java)
            startActivity(intent)
        }

        // Navigate directly to Home
        skipButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java) // replace with your home screen
            startActivity(intent)
            finish()
        }
    }
}
