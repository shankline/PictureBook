package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity1::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity2::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity3::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity4::class.java))
        }


    }
}