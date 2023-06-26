package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener {
//            Change the Color of Background to Blue Mode
            layout.setBackgroundResource(R.color.yellow)

        }
        buttonDark.setOnClickListener {
//            Change the Color of Background to Black Mode
            layout.setBackgroundResource(R.color.black)

        }
    }
}