package com.siri.RearrangeScreens

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    lateinit var enterInfo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        enterInfo = findViewById(R.id.enter_info)
        enterInfo.setOnClickListener(
            View.OnClickListener {
                Global2.pageChanger(this, 3)
            }
        )
    }
}
