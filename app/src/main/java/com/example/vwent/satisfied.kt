package com.example.vwent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class satisfied : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satisfied)
        clickListener()

    }
    public fun clickListener(){
        var yesbut = findViewById<Button>(R.id.button)
        var nobut = findViewById<Button>(R.id.button2)

        yesbut.setOnClickListener {
            startActivity(Intent(this@satisfied, Congrats::class.java))
        }
        nobut.setOnClickListener {
            startActivity(Intent(this@satisfied, touch::class.java))
        }


    }
}