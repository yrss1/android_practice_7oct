package com.example.practicelay
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView


class CountdownActivity : AppCompatActivity() {
    private lateinit var countdownText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seconds)
        countdownText = findViewById(R.id.countdownText)
        val sec = intent.getIntExtra("seconds", 0)
//        val sec = "asddas"
        countdownText.text = sec.toString()
    }
}