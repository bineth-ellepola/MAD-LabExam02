package com.example.myapplication_madlab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Details button
        val detailsButton = findViewById<Button>(R.id.detailsButton)
        detailsButton.setOnClickListener {
            val intent = Intent(this, HotelDetailsActivity::class.java)
            startActivity(intent)
        }

        // Notification button
        val notificationBtn = findViewById<ImageButton>(R.id.btnNotification)
        notificationBtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        // Profile button
        val profileBtn = findViewById<ImageButton>(R.id.btnAccount)
        profileBtn.setOnClickListener {
            val intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
        }

        // history button
        val fileBtn = findViewById<ImageButton>(R.id.btnFile)
        fileBtn.setOnClickListener {
            val intent = Intent(this, History_Activity::class.java)
            startActivity(intent)
        }
    }
}
