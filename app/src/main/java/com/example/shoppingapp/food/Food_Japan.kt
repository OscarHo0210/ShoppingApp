package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food_Japan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_japan)

        val button34 = findViewById<Button>(R.id.button34)
        button34.setOnClickListener {
            startActivity(Intent(this,Food_Japan_Chocolate::class.java))
        }

        val button35 = findViewById<Button>(R.id.button35)
        button35.setOnClickListener {
            startActivity(Intent(this,Food_Japan_Snack::class.java))
        }
    }
}