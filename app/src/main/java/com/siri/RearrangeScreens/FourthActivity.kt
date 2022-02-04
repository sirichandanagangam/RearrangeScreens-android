package com.siri.RearrangeScreens
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity

import android.R.attr.y

import android.content.Intent




class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        val button: Button = findViewById(R.id.simpleButton)
        button.setOnClickListener {
            /*val i = Intent(this, Activity::class.java)
            startActivity(i)*/
        }
    }
}
