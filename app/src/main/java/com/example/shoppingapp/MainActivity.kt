package com.example.shoppingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_grocery = findViewById<Button>(R.id.btn_grocery)
        btn_grocery.setOnClickListener{

        }

        val btn_electricity = findViewById<Button>(R.id.btn_choice_two)
        btn_electricity.setOnClickListener {

        }

        val btn_food = findViewById<Button>(R.id.btn_choice_three)
        btn_food.setOnClickListener {

        }

        val btn_cloth = findViewById<Button>(R.id.btn_choice_four)
        btn_cloth.setOnClickListener {
            startActivity(Intent(this,SecondActivity_Cloth::class.java))
        }
    }
}