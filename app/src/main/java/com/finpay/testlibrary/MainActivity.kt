package com.finpay.testlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.example.testlibrary.R
import com.finpay.sdk.FinpaySDK
import com.finpay.sdk.ui.TopUpActivity
import com.finpay.sdk.widgets.MainButtonWidget

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textSaldo = findViewById(R.id.tv_saldo) as TextView
        var btnTopUp = findViewById(R.id.btnTopUp) as MainButtonWidget
        var btnTopUp2 = findViewById(R.id.linear_topup) as LinearLayout

        textSaldo.text = FinpaySDK().getUserBallance()

        btnTopUp.setOnClickListener {
            Intent(this, TopUpActivity::class.java).apply {
                startActivity(this)
            }
            //TopUpController().topUp(this)
        }

        btnTopUp2.setOnClickListener {
            Intent(this, TopUpActivity::class.java).apply {
                startActivity(this)
            }
            //TopUpController().topUp(this)
        }


    }
}