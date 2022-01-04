package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShortSleeve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shortsleeve)

        val btn_choice_two = findViewById<Button>(R.id.btn_choice_two)
        btn_choice_two.setOnClickListener {
            startActivity(Intent(this,ShortSleeve1::class.java))
        }

        val btn_choice_two2 = findViewById<Button>(R.id.btn_choice_two2)
        btn_choice_two2.setOnClickListener {
            startActivity(Intent(this,ShortSleeve3::class.java))
        }

        val btn_choice_two3 = findViewById<Button>(R.id.btn_choice_two3)
        btn_choice_two3.setOnClickListener {
            startActivity(Intent(this,ShortSleeve4::class.java))
        }

        val btn_choice_two4 = findViewById<Button>(R.id.btn_choice_two4)
        btn_choice_two4.setOnClickListener {
            startActivity(Intent(this,ShortSleeve2::class.java))
        }
    }
}