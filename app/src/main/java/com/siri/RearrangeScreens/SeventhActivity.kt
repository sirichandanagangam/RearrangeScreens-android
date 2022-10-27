package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SeventhActivity:AppCompatActivity(){
    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)

        submit = findViewById(R.id.submit7)

        submit.setOnClickListener {
            Global2.pageChanger(this, 7)
        }
    }
}