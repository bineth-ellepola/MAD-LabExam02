package com.example.myapplication_madlab02

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val backBtn = findViewById<ImageButton>(R.id.btnBack)
        backBtn.setOnClickListener {
            finish()
        }
    }
}
