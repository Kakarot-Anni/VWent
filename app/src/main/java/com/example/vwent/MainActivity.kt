package com.example.vwent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickListener()
    }
    public fun clickListener() {
        var fighter = findViewById<CardView>(R.id.imageView1)
        var winners = findViewById<CardView>(R.id.imageView6)
        var helpers = findViewById<CardView>(R.id.imageView7)

        fighter.setOnClickListener {
            startActivity(Intent(this@MainActivity, Fighter::class.java))
        }

        winners.setOnClickListener {
            startActivity(Intent(this@MainActivity, Winner::class.java))
        }

        helpers.setOnClickListener {
            startActivity(Intent(this@MainActivity, ChatInterface::class.java))
        }
    }


}