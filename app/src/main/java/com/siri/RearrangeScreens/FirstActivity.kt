package com.siri.RearrangeScreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    lateinit var login: Button
    lateinit var register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        login = findViewById(R.id.login)
        login.setOnClickListener {
            Global2.pageChanger(this, 1)
        }
        register = findViewById(R.id.register)
        register.setOnClickListener {
            Global2.pageChanger(this, 1, 1)
        }
    }
}
