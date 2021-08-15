package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvRoll: TextView = findViewById(R.id.tvRoll)

        val btnRoll: Button = findViewById(R.id.btnRoll)

        val ivDice: ImageView = findViewById(R.id.ivDice)

        btnRoll.setOnClickListener{
            val randomNumber = (1..6).random()
            tvRoll.text = randomNumber.toString()

            if (randomNumber==1)
            {
                ivDice.setImageResource(R.drawable.dice1)
            }
            else if (randomNumber==2)
            {
                ivDice.setImageResource(R.drawable.dice2)
            }
            else if (randomNumber==3)
            {
                ivDice.setImageResource(R.drawable.dice3)
            }
            else if (randomNumber==4)
            {
                ivDice.setImageResource(R.drawable.dice4)
            }
            else if (randomNumber==5)
            {
                ivDice.setImageResource(R.drawable.dice5)
            }
            else if (randomNumber==6)
            {
                ivDice.setImageResource(R.drawable.dice6)
            }
        }
    }
}