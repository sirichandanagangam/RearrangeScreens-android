package com.siri.RearrangeScreensSDK

import android.content.Context
import android.widget.Toast

object ScreenUtils {

    fun takeScreenNames(context : Context?, stringNames:String? = null)
    {
        Toast.makeText(context, stringNames, Toast.LENGTH_LONG).show()
    }

}