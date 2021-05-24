package com.example.covidvaccineavailability

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var searchButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchButton = findViewById(R.id.button)
        searchButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java).apply {
                putExtra(EXTRA_MESSAGE, "hello")
            }
            Toast.makeText(this@MainActivity, "Redirecting", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }


    }
}