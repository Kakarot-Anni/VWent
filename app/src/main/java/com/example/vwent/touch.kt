package com.example.vwent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class touch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_touch)
        clickListener()

    }
    public fun clickListener(){
        var but = findViewById<Button>(R.id.button3)

        but.setOnClickListener {
            startActivity(Intent(this@touch, ChatInterface::class.java))
        }


    }
}