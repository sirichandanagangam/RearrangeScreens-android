package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EighthActivity : AppCompatActivity() {
    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eighth)

        submit = findViewById(R.id.submit8)

        submit.setOnClickListener {
            Global2.pageChanger(this, 8)
        }
    }
}
