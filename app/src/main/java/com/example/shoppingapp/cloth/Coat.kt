package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coat)

        val btn_choice_two2 = findViewById<Button>(R.id.btn_choice_two2)
        btn_choice_two2.setOnClickListener {
            startActivity(Intent(this,Coat2::class.java))
        }

        val btn_choice_two3 = findViewById<Button>(R.id.btn_choice_two3)
        btn_choice_two3.setOnClickListener {
            startActivity(Intent(this,Coat4::class.java))
        }

        val btn_choice_two5 = findViewById<Button>(R.id.btn_choice_two5)
        btn_choice_two5.setOnClickListener {
            startActivity(Intent(this,Coat1::class.java))
        }

        val btn_choice_two6 = findViewById<Button>(R.id.btn_choice_two6)
        btn_choice_two6.setOnClickListener {
            startActivity(Intent(this,Coat3::class.java))
        }
    }
}