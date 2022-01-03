package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity_3C_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_3c_one)

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_one::class.java))
        }

        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_two::class.java))
        }

        val button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_three::class.java))
        }

        val button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_four::class.java))
        }
    }
}