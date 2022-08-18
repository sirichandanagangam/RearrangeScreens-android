package com.siri.RearrangeScreens

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    lateinit var b4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        b4 = findViewById(R.id.simpleButton)
        b4.setOnClickListener(View.OnClickListener {
            Global2.pageChanger(ThirdActivity@ this)
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Global2.screenNum -= 1
    }
}

