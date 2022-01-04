package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pants : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pants)

        val btn_choice_two2 = findViewById<Button>(R.id.btn_choice_two2)
        btn_choice_two2.setOnClickListener {
            startActivity(Intent(this,pants1::class.java))
        }

        val btn_choice_two3 = findViewById<Button>(R.id.btn_choice_two3)
        btn_choice_two3.setOnClickListener {
            startActivity(Intent(this,pants3::class.java))
        }

        val btn_choice_two5 = findViewById<Button>(R.id.btn_choice_two5)
        btn_choice_two5.setOnClickListener {
            startActivity(Intent(this,pants2::class.java))
        }

        val btn_choice_two6 = findViewById<Button>(R.id.btn_choice_two6)
        btn_choice_two6.setOnClickListener {
            startActivity(Intent(this,pants4::class.java))
        }
    }
}