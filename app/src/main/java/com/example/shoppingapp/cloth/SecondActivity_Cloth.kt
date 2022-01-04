package com.example.shoppingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity_Cloth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_cloth)

        val btn_tshirt = findViewById<Button>(R.id.btn_tshirt)
        btn_tshirt.setOnClickListener {
            startActivity(Intent(this,ShortSleeve::class.java))
        }

        val btn_shirt = findViewById<Button>(R.id.btn_shirt)
        btn_shirt.setOnClickListener {
            startActivity(Intent(this,LongSleeve::class.java))
        }

        val btn_shorts = findViewById<Button>(R.id.btn_shorts)
        btn_shorts.setOnClickListener {
            startActivity(Intent(this,Coat::class.java))
        }

        val btn_pants = findViewById<Button>(R.id.btn_pants)
        btn_pants.setOnClickListener {
            startActivity(Intent(this,pants::class.java))
        }
    }
}