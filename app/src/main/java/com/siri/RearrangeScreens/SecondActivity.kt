package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    lateinit var google: Button
    lateinit var twitter: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        google = findViewById(R.id.google)
        google.setOnClickListener {
            Global2.pageChanger(this, 2)
        }
        twitter = findViewById(R.id.twitter)
        twitter.setOnClickListener {
            Global2.pageChanger(this, 2, 1)
        }
    }
}
