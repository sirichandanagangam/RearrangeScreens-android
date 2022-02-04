package com.siri.RearrangeScreens

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.siri.RearrangeScreensSDK.ScreenUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ScreenUtils.takeScreenNames(this@MainActivity,"Screen1")
        val button: Button = findViewById(R.id.simpleButton)
        button.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
    }


}
