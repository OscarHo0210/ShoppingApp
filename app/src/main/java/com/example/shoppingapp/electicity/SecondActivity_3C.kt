package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity_3C : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_3c)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this,ThirdActivity_3C_one::class.java))
        }

        val  button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this,ThirdActivity_3C_two::class.java))
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            startActivity(Intent(this,ThirdActivity_3C_three::class.java))
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            startActivity(Intent(this,ThirdActivity_3C_four::class.java))
        }
    }
}