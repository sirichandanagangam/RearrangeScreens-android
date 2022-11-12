package com.siri.RearrangeScreensSDK

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.util.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.auth.FirebaseUser

import com.google.firebase.database.FirebaseDatabase




private lateinit var database: DatabaseReference
var list1: MutableList<String> = ArrayList()

object ScreenUtils {
    /**
     * This function retrieves the names of all screens which are used in this app
     */
    fun takeScreenNames(context: Context?, screenNames: Array<String>) {
        val str_Array: Array<String> = screenNames
        Log.d("Array returned", "Array returned from method:" + Arrays.toString(str_Array))
        Toast.makeText(context, screenNames[0], Toast.LENGTH_LONG).show()
        // Write a message to the database

        database = Firebase.database.getReference("screennames")
        val storeScreenNames: List<String> = str_Array.toList()
        database.setValue(storeScreenNames).addOnCompleteListener(OnCompleteListener<Void> { task ->
            if (task.isSuccessful()) {
                Toast.makeText(context, "success", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, "failure", Toast.LENGTH_LONG).show();
            }

        });
    }

    /**
     * This function returns the order of screens which the user specifies in the web portal
     */

    fun returnScreenOrder() {

        database = Firebase.database.reference.child("screenorder")
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

               
            }

            override fun onCancelled(error: DatabaseError) {
                
            }
        })

    }
}
