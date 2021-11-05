package com.example.hm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    val name = intent.getStringExtra("NAME")
    val surname = intent.getStringExtra("SURNAME")

        tv1.setText(" " + name + " " + surname)


        btnback.setOnClickListener(){
             onBackPressed()
        }
    }
}