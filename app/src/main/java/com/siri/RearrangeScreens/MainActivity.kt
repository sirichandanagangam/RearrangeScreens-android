package com.siri.RearrangeScreens

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var db: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getFromDb() {
        var orderFromFirebase = ArrayList<Int>()
        db.collection("ScreenOrder")
            .document("Order")
            .get()
            .addOnSuccessListener { documentReference ->
                val data = documentReference.data?.get("list") as ArrayList<String>
                for (order in data) {
                    orderFromFirebase.add(Integer.parseInt(order))
                }
                Global2.addListOfAllScreens(
                    arrayOf(
                        FirstActivity::class.java,
                        SecondActivity::class.java,
                        ThirdActivity::class.java,
                        FourthActivity::class.java
                    )
                )
                Global2.addOrder(applicationContext, orderFromFirebase, this)
            }
            .addOnFailureListener { e ->
                e.message?.let { Log.d("getFromDb error", it) }
                Global2.addListOfAllScreens(
                    arrayOf(
                        FirstActivity::class.java,
                        SecondActivity::class.java,
                        ThirdActivity::class.java,
                        FourthActivity::class.java
                    )
                )
                Global2.pageChanger(MainActivity@ this)
            }
    }

    override fun onResume() {
        super.onResume()
        db = FirebaseFirestore.getInstance()
        getFromDb()

    }


}
