package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food_America : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_america)

        val button33 = findViewById<Button>(R.id.button34)
        button33.setOnClickListener {
            startActivity(Intent(this,Food_America_Godiva::class.java))
        }
    }
}