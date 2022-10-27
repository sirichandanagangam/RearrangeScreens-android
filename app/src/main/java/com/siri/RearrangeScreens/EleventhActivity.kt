package com.siri.RearrangeScreens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EleventhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleventh)
        Global2.pageChanger(this, 11)
    }
}
