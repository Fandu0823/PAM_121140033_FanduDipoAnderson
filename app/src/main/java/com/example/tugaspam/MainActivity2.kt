package com.example.tugaspam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent2 = intent
        val pesan = intent2.getStringExtra("Pesan")

        val textView = findViewById<TextView>(R.id.textPesan)
        textView.text = "Pesan dari Main Activity" + pesan
    }
}