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
    }
}