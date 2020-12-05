package com.vishwa.diceroll_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Roll: Button = findViewById(R.id.roll_button)
        Roll.setOnClickListener { roll_dice() }
        diceImage = findViewById(R.id.dice_image)
        val Roll2: Button = findViewById(R.id.roll_button_2)
        Roll2.setOnClickListener { getRandomDiceImage() }
    }

    private fun roll_dice() {

        val randomInt: Int = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    private fun getRandomDiceImage(): Int {
        val randomInt: Int = (1..6).random()
        val drawableResource: Int = when (randomInt) {
            1 -> R.drawable.dice_6
            2 -> R.drawable.dice_5
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_3
            5 -> R.drawable.dice_2
            else -> R.drawable.dice_1
        }
        diceImage.setImageResource(drawableResource)
        return drawableResource
    }
}