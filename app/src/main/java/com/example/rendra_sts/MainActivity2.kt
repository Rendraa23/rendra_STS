package com.example.rendra_sts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttontwo = findViewById<Button>(R.id.button2)
        buttontwo.setOnClickListener {
            val intent2 = Intent (this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}