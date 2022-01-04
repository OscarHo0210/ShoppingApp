package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondDaily : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_daily)

        val btn_tshirt = findViewById<Button>(R.id.btn_tshirt)
        btn_tshirt.setOnClickListener {
            startActivity(Intent(this,Bag::class.java))
        }

        val btn_shirt = findViewById<Button>(R.id.btn_shirt)
        btn_shirt.setOnClickListener {
            startActivity(Intent(this,Cosmetic::class.java))
        }

        val btn_shorts = findViewById<Button>(R.id.btn_shorts)
        btn_shorts.setOnClickListener {
            startActivity(Intent(this,Houseware::class.java))
        }

        val btn_pants = findViewById<Button>(R.id.btn_pants)
        btn_pants.setOnClickListener {
            startActivity(Intent(this,Stationery::class.java))
        }
    }
}