package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weightEditText: EditText = findViewById(R.id.weight)
         val heightEditText: EditText = findViewById(R.id.height)
        val calculateButton: Button = findViewById(R.id.calculateButton)
       val bmiResultTextView: TextView = findViewById(R.id.bmiResultTextView)

        calculateButton.setOnClickListener {
            val weight: Double = weightEditText.text.toString().toDouble()
            val height: Double = heightEditText.text.toString().toDouble()
            val bmi = weight / (height/100).pow(2)
            bmiResultTextView.text = String.format("Your BMI: %2f", bmi)
        }



    }
}