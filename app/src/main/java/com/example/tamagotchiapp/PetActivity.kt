package com.example.tamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PetActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet)
        // Declarations
        val feedButton = findViewById<Button>(R.id.feedbutton)
        val foodBowl = findViewById<ImageView>(R.id.imageView3)
        val washButton = findViewById<Button>(R.id.washbutton)
        val soapyFoam = findViewById<ImageView>(R.id.imageView4)
        val playButton = findViewById<Button>(R.id.playbutton)
        val tennisBall = findViewById<ImageView>(R.id.imageView5)
        val hungerCount = findViewById<TextView>(R.id.hungerText)
        val washCount = findViewById<TextView>(R.id.cleanText)
        val playCount = findViewById<TextView>(R.id.happyText)
        val millisInFuture = 10000L
        val countDownInterval = 1000L

        // Countdown for each of the values, uses a countdown object
        val hungerCountDown = object : CountDownTimer(millisInFuture, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                hungerCount.text = ("$secondsRemaining")
            }

            override fun onFinish() {
            }


        }
        val washCountDown = object : CountDownTimer(millisInFuture, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                washCount.text = ("$secondsRemaining")
            }

            override fun onFinish() {
            }


        }
        val playCountDown = object : CountDownTimer(millisInFuture, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                playCount.text = ("$secondsRemaining")
            }

            override fun onFinish() {
            }

        }



        // Button functionality, changes the viewability of the images and updates the countdown
        feedButton.setOnClickListener {
            if (foodBowl.visibility == View.INVISIBLE) {
                foodBowl.visibility = View.VISIBLE
                soapyFoam.visibility = View.INVISIBLE
                tennisBall.visibility = View.INVISIBLE
                hungerCount.text = "10"
                hungerCountDown.cancel()
            } else {
                foodBowl.visibility = View.INVISIBLE
                hungerCountDown.cancel()
                hungerCountDown.start()
            }

        }

        washButton.setOnClickListener {
            if (soapyFoam.visibility == View.INVISIBLE) {
                soapyFoam.visibility = View.VISIBLE
                tennisBall.visibility = View.INVISIBLE
                foodBowl.visibility = View.INVISIBLE
                washCount.text = "10"
                washCountDown.cancel()
            } else {
                soapyFoam.visibility = View.INVISIBLE
                washCountDown.cancel()
                washCountDown.start()
            }
        }
        playButton.setOnClickListener {
            if (tennisBall.visibility == View.INVISIBLE) {
                tennisBall.visibility = View.VISIBLE
                foodBowl.visibility = View.INVISIBLE
                soapyFoam.visibility = View.INVISIBLE
                playCount.text = "10"
                playCountDown.cancel()
            } else {
                tennisBall.visibility = View.INVISIBLE
                playCountDown.cancel()
                playCountDown.start()
            }


        }
        // Starts the countdown on each of the values
        playCountDown.start()
        washCountDown.start()
        hungerCountDown.start()
    }
}




