package com.example.practicelay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secondsInput = findViewById<EditText>(R.id.secondsInput)
        val checkButton = findViewById<Button>(R.id.checkButton)
        checkButton.setOnClickListener {
            if (secondsInput.text.isEmpty()) {
                Toast.makeText(applicationContext, "text", Toast.LENGTH_SHORT).show()
            } else {
                val seconds = secondsInput.text.toString().toInt()

                val intent = Intent(this, CountdownActivity::class.java)
                intent.putExtra("seconds", seconds)
                startActivity(intent)
            }
        }

//        checkButton.setOnClickListener(new View.OnClick)

    }

}