package com.siri.RearrangeScreensSDK

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.util.*

object ScreenUtils {
    /**
     * This function retrieves the names of all screens which are used in this app
     */
    fun takeScreenNames(context: Context?, screenNames: Array<String>) {
        val str_Array: Array<String> = screenNames
        Log.d("Array returned", "Array returned from method:" + Arrays.toString(str_Array))
        Toast.makeText(context, screenNames[0], Toast.LENGTH_LONG).show()
    }

    /**
     * This function returns the order of screens which the user specifies in the web portal
     *
     * It is mocked for now
     */
    fun returnScreenOrder() {
        var screenOrderList: Array<String> = arrayOf("Screen3", "Screen1", "Screen2");
    }

}