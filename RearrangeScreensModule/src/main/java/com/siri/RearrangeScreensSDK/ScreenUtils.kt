package com.siri.RearrangeScreensSDK

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.util.*

object ScreenUtils {
    fun takeScreenNames(context: Context?, screenNames: Array<String>) {
        val str_Array: Array<String> = screenNames
        Log.d("Array returned", "Array returned from method:" + Arrays.toString(str_Array))
        Toast.makeText(context, screenNames[0], Toast.LENGTH_LONG).show()
    }

    fun returnScreenOrder() {
        var screenOrderList: Array<String> = arrayOf("Screen3", "Screen1", "Screen2");
    }

}