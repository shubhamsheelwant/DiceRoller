package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var imageDice:ImageView
    lateinit var btnRoll: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initClickListener()
    }

    private fun initView() {
        imageDice = findViewById(R.id.image_dice)
        btnRoll = findViewById(R.id.btn_roll)
    }

    private fun initClickListener() {
        btnRoll.setOnClickListener{
            val number = generateRandomNumber()
//            Log.i("initClickListener","$number")
            when(number){
                1-> imageDice.setImageResource(R.drawable.dice_1)
                2-> imageDice.setImageResource(R.drawable.dice_2)
                3-> imageDice.setImageResource(R.drawable.dice_3)
                4-> imageDice.setImageResource(R.drawable.dice_4)
                5-> imageDice.setImageResource(R.drawable.dice_5)
                else -> imageDice.setImageResource(R.drawable.dice_6)
            }
        }
    }

    private fun generateRandomNumber(): Int {
        val randomNumber = Random().nextInt(6) + 1
        return randomNumber
    }

}