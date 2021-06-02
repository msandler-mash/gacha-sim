package com.example.gatchagame

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PriconeSim : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spin_layout)

        var titleText = findViewById<TextView>(R.id.gameTitle);
        titleText.text = "Princess Connect"
    }
}
