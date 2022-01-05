package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShortSleeve1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_short_sleeve1)


        val btn_tshirt26 = findViewById<Button>(R.id.btn_tshirt26)
        btn_tshirt26.setOnClickListener {
            startActivity(Intent(this,ShortSleeve::class.java))
        }
    }
}