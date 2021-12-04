package com.example.zhanylexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.btn)
        btn.setOnClickListener { goToActivityWithAction() }

    }

    private fun goToActivityWithAction() {
        val intent = Intent("contactApp")
        intent.putExtra("key", "contactApp")
        startActivity(intent)
    }

}