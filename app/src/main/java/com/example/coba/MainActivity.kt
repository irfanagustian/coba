package com.example.coba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn1) as Button

        button1.setOnClickListener{
            Toast.makeText(this@MainActivity, "I Love You", Toast.LENGTH_SHORT).show()
        }
    }
}