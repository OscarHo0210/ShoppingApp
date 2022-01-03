package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity_3C_three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_3c_three)

        val button17 = findViewById<Button>(R.id.button17)
        button17.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_rd_one::class.java))
        }

        val button18 = findViewById<Button>(R.id.button18)
        button18.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_rd_two::class.java))
        }

        val button19 = findViewById<Button>(R.id.button19)
        button19.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_rd_three::class.java))
        }

        val button20 = findViewById<Button>(R.id.button20)
        button20.setOnClickListener {
            startActivity(Intent(this,FourthActivity_3C_rd_four::class.java))
        }
    }
}