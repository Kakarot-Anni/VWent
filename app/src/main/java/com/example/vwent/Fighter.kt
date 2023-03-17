package com.example.vwent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Fighter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighter)
        clickListener()
    }

    public fun clickListener(){
        var yesBut = findViewById<Button>(R.id.button)
        var noBut = findViewById<Button>(R.id.button2)

        yesBut.setOnClickListener {
            startActivity(Intent(this@Fighter, Support::class.java))
        }
        noBut.setOnClickListener {
            startActivity(Intent(this@Fighter, Describe::class.java))
        }


    }
}