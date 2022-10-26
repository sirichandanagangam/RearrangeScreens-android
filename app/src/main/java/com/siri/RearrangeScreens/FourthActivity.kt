package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    lateinit var go: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        go = findViewById(R.id.go)
        go.setOnClickListener {
            Global2.pageChanger(FourthActivity@ this)
        }
    }
}
