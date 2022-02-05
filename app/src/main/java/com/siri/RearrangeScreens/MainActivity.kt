package com.siri.RearrangeScreens

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.siri.RearrangeScreensSDK.ScreenUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var screenNames: Array<String> = arrayOf("Screen1", "Screen2", "Screen3")
        ScreenUtils.takeScreenNames(this@MainActivity, screenNames)
        setContentView(R.layout.activity_main)
        val str_Array: Unit = ScreenUtils.returnScreenOrder()
        Log.d("received screen order ", "Recieved screen order is :" + (str_Array))
        val button: Button = findViewById(R.id.simpleButton)
        button.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }

    }


}
