package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        val textview = findViewById<TextView>(R.id.textview)
        val button  : Button = findViewById(R.id.button)

        button.setOnClickListener {
            count++
            textview.text = "Count: $count"
        }

    }
}