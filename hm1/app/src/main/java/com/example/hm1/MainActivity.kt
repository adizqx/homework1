package com.example.hm1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext.setOnClickListener {

            if(et1.text.trim().isEmpty() || et2.text.trim().isEmpty()) {
                Toast.makeText(this, "Заполните поля", Toast.LENGTH_LONG).show()
            } else {
                val name = et1.text.toString()
                val surname = et2.text.toString()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("NAME", name)
                intent.putExtra("SURNAME", surname)
                startActivity(intent)
            }
        }
    }
}