package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class PetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet)
        val feedButton = findViewById<Button>(R.id.feedbutton)
        val foodBowl = findViewById<ImageView>(R.id.imageView3)
        val washButton = findViewById<Button>(R.id.washbutton)
        val soapyFoam = findViewById<ImageView>(R.id.imageView4)
        val playButton = findViewById<Button>(R.id.playbutton)
        val tennisBall = findViewById<ImageView>(R.id.imageView5)

        feedButton.setOnClickListener {
            if (foodBowl.visibility == View.INVISIBLE) {
                foodBowl.visibility = View.VISIBLE
                soapyFoam.visibility = View.INVISIBLE
                tennisBall.visibility = View.INVISIBLE
            } else {
                foodBowl.visibility = View.INVISIBLE
            }

        }
        washButton.setOnClickListener {
            if (soapyFoam.visibility == View.INVISIBLE) {
                soapyFoam.visibility = View.VISIBLE
                tennisBall.visibility = View.INVISIBLE
                foodBowl.visibility = View.INVISIBLE
            } else {
                soapyFoam.visibility = View.INVISIBLE
            }
        }
        playButton.setOnClickListener {
            if (tennisBall.visibility == View.INVISIBLE) {
                tennisBall.visibility = View.VISIBLE
                foodBowl.visibility = View.INVISIBLE
                soapyFoam.visibility = View.INVISIBLE
            } else {
                tennisBall.visibility = View.INVISIBLE
            }
        }

    }

}
