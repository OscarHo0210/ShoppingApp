package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity_3C_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_3c_two)

        val button13 = findViewById<Button>(R.id.button13)
        button13.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_sd_one::class.java))
        }

        val button14 = findViewById<Button>(R.id.button14)
        button14.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_sd_two::class.java))
        }

        val button15 = findViewById<Button>(R.id.button15)
        button15.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_sd_three::class.java))
        }

        val button16 = findViewById<Button>(R.id.button16)
        button16.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_sd_four::class.java))
        }
    }
}