package com.siri.RearrangeScreens


import android.view.View
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    lateinit var b1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        b1 = findViewById(R.id.simpleButton)
        b1.setOnClickListener(View.OnClickListener {
            Global2.pageChanger(FirstActivity@ this)
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Global2.screenNum -= 1
    }
}


