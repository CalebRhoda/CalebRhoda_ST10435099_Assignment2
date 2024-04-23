package com.example.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var progressValue = 0
        val isCountingUp = true
        val startButton = findViewById<Button>(R.id.button)

        startButton.setOnClickListener {
            timer = object : CountDownTimer(Long.MAX_VALUE, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    if (isCountingUp) {
                        progressValue++
                    } else {
                        progressValue--
                    }

                    }
                override fun onFinish() {
                    // Timer finished
                }

            }
            timer.start()
            val intent = Intent(this, PetActivity::class.java)
            startActivity(intent)
        }

    }
}