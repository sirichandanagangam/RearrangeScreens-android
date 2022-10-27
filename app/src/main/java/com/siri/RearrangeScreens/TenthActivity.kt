package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TenthActivity : AppCompatActivity() {
    lateinit var dashboard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenth)

        dashboard = findViewById(R.id.dashboard)
        dashboard.setOnClickListener {
            Global2.pageChanger(this, 10)
        }
    }
}
