package com.example.testlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.libexample.LibDebug.Builder.i
import com.example.libexample.LibDebug.Builder.showToast
import com.example.libexample.ListPaymentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //panggil fungsi log
        i("Testing click")

        var btnTest = findViewById(R.id.btn_test) as Button
        btnTest.setOnClickListener {
            //showToast(applicationContext, "ini adalah toast dari library")
            Intent(this, ListPaymentActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}