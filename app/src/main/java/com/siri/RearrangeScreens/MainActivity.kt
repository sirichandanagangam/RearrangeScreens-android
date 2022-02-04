package com.siri.RearrangeScreens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.siri.RearrangeScreensSDK.ScreenUtils
import java.util.*
import javax.sql.StatementEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var screenNames: Array<String> = arrayOf("Screen1", "Screen2", "Screen3")
        ScreenUtils.takeScreenNames(this@MainActivity,screenNames)
        //val str_Array: Unit = ScreenUtils.returnScreenOrder()
        //System.out.println("Recieved screen order is :" +(str_Array))
        setContentView(R.layout.activity_main)

    }
}


