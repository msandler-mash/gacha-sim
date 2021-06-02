package com.example.gatchagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pricone = findViewById<Button>(R.id.pricone)

        pricone.setOnClickListener {
            var intent = Intent(this@MainActivity, PriconeSim::class.java)
            startActivity(intent)
        }
    }

}