package com.siri.RearrangeScreens

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Global2 {
    companion object {
        private var screenListFromDatabase = ArrayList<Any>()
        var screenPaths = ArrayList<Map<String, Int>>()

        fun addListOfAllScreens(screensList: Array<Any>) {
            screenListFromDatabase.clear()
            for (activity in screensList) {
                screenListFromDatabase.add(activity)
            }
        }

        fun addOrder2(context: Context, myarray: ArrayList<Map<String, Int>>) {
            if (myarray.size != screenListFromDatabase.size) {
                Toast.makeText(
                    context,
                    "Activity list size does not match with order size",
                    Toast.LENGTH_SHORT
                ).show()
                return
            }
            screenPaths = myarray
        }


        fun pageChanger(activity: Activity, screenNum: Int = -5, state: Int = 0) {

            if (screenNum == -5) { // start activity
                val active = screenPaths[0].getValue("current")
                activity.startActivity(Intent(activity, screenListFromDatabase[active-1] as Class<*>))
            } else {
                val active = getIndexOrderInPath(screenNum)
                val nextActivity = if (state == 0)
                    screenPaths[active].getValue("one") - 1
                else
                    screenPaths[active].getValue("two") - 1

                when (nextActivity) {
                    -1 -> {
                        activity.startActivity(Intent(activity, MainActivity::class.java))
                        activity.finishAffinity()
                        return
                    }
                    -2 -> {
                        activity.finish()
                        return
                    }
                    else -> {
                        val currentActivity = screenPaths[nextActivity].getValue("current")

                        activity.startActivity(
                            Intent(
                                activity,
                                screenListFromDatabase[currentActivity - 1] as Class<*>
                            )
                        )
                    }
                }

            }
        }

        private fun getIndexOrderInPath(num: Int): Int {
            return screenPaths.map { it.getValue("current") }.indexOf(num)
        }

    }
}