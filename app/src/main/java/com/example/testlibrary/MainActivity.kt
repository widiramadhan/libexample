package com.example.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.libexample.LibDebug.Builder.i

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnTest = findViewById(R.id.btn_test) as Button

        btnTest.setOnClickListener {
            i("Testing click")
        }
    }
}