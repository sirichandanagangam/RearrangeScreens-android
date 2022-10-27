package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FifthActivity:AppCompatActivity() {
    lateinit var review: Button
    lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        review = findViewById(R.id.review5)
        back = findViewById(R.id.back5)

        review.setOnClickListener {
            Global2.pageChanger(this,5)
        }
        back.setOnClickListener {
            Global2.pageChanger(this,5, 1)
        }

    }
}