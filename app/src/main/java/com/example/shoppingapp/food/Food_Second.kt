package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food_Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_second)

        val button30 = findViewById<Button>(R.id.button30)
        button30.setOnClickListener {
            startActivity(Intent(this,Food_America::class.java))
        }

        val button31 = findViewById<Button>(R.id.button31)
        button31.setOnClickListener {
            startActivity(Intent(this,Food_Korea::class.java))
        }

        val button32 = findViewById<Button>(R.id.button32)
        button32.setOnClickListener {
            startActivity(Intent(this,Food_Japan::class.java))
        }
    }
}