package com.siri.RearrangeScreens

import android.view.View
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    lateinit var b3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        b3 = findViewById(R.id.simpleButton)
        b3.setOnClickListener(View.OnClickListener {
            Global2.pageChanger(SecondActivity@ this)
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Global2.screenNum -= 1
    }
}
