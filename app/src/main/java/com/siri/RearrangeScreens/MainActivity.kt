package com.siri.RearrangeScreens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.siri.RearrangeScreensSDK.ScreenUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ScreenUtils.takeScreenNames(this@MainActivity,"Screen1")

    }
}
