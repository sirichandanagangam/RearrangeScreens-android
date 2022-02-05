package com.siri.RearrangeScreens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        val button: Button = findViewById(R.id.simpleButton)
        button.setOnClickListener {
            val i = Intent(this, FourthActivity::class.java)
            startActivity(i)
        }
    }
}
