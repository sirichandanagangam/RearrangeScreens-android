package com.siri.RearrangeScreens

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    lateinit var b2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        b2 = findViewById(R.id.simpleButton)
        b2.setOnClickListener(View.OnClickListener {
            Global2.pageChanger(FourthActivity@ this)
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Global2.screenNum -= 1
    }
}

