package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixthActivity:AppCompatActivity() {
    lateinit var review: Button
    lateinit var back: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        review = findViewById(R.id.review6)
        back = findViewById(R.id.back6)

        review.setOnClickListener {
            Global2.pageChanger(this,6)
        }
        back.setOnClickListener {
            Global2.pageChanger(this,6, 1)
        }

    }
}