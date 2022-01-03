package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity_3C_four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_3c_four)

        val button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_4th_one::class.java))
        }

        val button22 = findViewById<Button>(R.id.button22)
        button22.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_4th_two::class.java))
        }

        val button23 = findViewById<Button>(R.id.button23)
        button23.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_4th_three::class.java))
        }

        val button24 = findViewById<Button>(R.id.button24)
        button24.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_4th_four::class.java))
        }
    }
}