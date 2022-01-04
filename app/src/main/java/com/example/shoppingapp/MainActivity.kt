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
            startActivity(Intent(this,SecondDaily::class.java))
        }

        val btn_electricity = findViewById<Button>(R.id.btn_choice_two)
        btn_electricity.setOnClickListener {
            startActivity(Intent(this,SecondActivity_3C::class.java))
        }

        val btn_food = findViewById<Button>(R.id.btn_choice_three)
        btn_food.setOnClickListener {
            startActivity(Intent(this,Food_Second::class.java))
        }

        val btn_cloth = findViewById<Button>(R.id.btn_choice_four)
        btn_cloth.setOnClickListener {
            startActivity(Intent(this,SecondActivity_Cloth::class.java))
        }

        val btn_Login = findViewById<Button>(R.id.btn_login)
        btn_Login.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}