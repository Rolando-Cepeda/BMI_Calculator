package com.example.bmi_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var welcomeTextView : TextView
    lateinit var clickButton: Button
    lateinit var clickButton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeTextView = findViewById(R.id.welcomeTextView)
        clickButton = findViewById(R.id.clickButton)
        clickButton2 = findViewById(R.id.clickButton2)

        welcomeTextView.text = "Bienvenido a mi primera Aplicación Android"

        clickButton.setOnClickListener {
            welcomeTextView.text = "Sigue intentando"
        }
        clickButton2.setOnClickListener {
            welcomeTextView.text = "Bienvenido a mi primera Aplicación Android"
        }



    }
}