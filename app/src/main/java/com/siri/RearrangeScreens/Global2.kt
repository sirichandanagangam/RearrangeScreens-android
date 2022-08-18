package com.siri.RearrangeScreens

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Global2 {
    companion object {
        var screenListFromDatabase = ArrayList<Any>()
        var screenNum = 0

        fun addListOfAllScreens(screensList: Array<Any>) {
            screenListFromDatabase.clear()
            for (x in screensList) {
                screenListFromDatabase.add(x)
            }
        }

        fun addOrder(
            context: Context,
            screensListFromDatabase: ArrayList<Int>,
            activity: Activity
        ) {
            if (screensListFromDatabase.size != screenListFromDatabase.size) {
                Toast.makeText(
                    context,
                    "Activity list size does not match with order size",
                    Toast.LENGTH_SHORT
                ).show()
                return
            }
            screenNum = 0
            val updatedScreenList = screenListFromDatabase
            val finalScreenList = ArrayList<Any>()
            for (x in screensListFromDatabase) {
                finalScreenList.add(updatedScreenList.get(x - 1))
            }
            screenListFromDatabase = finalScreenList
            pageChanger(activity)
        }

        fun pageChanger(activity: Activity) {
            if (screenNum < screenListFromDatabase.size) {
                activity.startActivity(
                    Intent(
                        activity,
                        screenListFromDatabase.get(screenNum) as Class<*>
                    )
                )
                screenNum += 1
            } else {
                screenNum = 0
                activity.startActivity(Intent(activity, MainActivity::class.java))
                activity.finishAffinity()
            }
        }
    }
}