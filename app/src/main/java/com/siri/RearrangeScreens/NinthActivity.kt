package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NinthActivity : AppCompatActivity() {
    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth)

        submit = findViewById(R.id.submit9)

        submit.setOnClickListener {
            Global2.pageChanger(this, 9)
        }
    }
}
