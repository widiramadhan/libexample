package com.finpay.sdk

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class ListPaymentActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_payment)

        var String = intent.getStringExtra("titleApp")
        setTitle(String)

        listView = findViewById(R.id.listView)

        var list = mutableListOf<PaymentModel>()

        list.add(PaymentModel("Bank Central Asia (BCA)",   "Description for BCA...",   R.drawable.ic_bca  ))
        list.add(PaymentModel("Artha Graha Internasional",   "Description for AGI...",   R.drawable.ic_agi  ))
        list.add(PaymentModel("ATM Bersama", "Description for ATM Bersama...", R.drawable.ic_atm_bersama  ))
        list.add(PaymentModel("BNI",  "Description for BNI...",  R.drawable.ic_bni  ))
        list.add(PaymentModel("BRI",  "Description for BRI...",  R.drawable.ic_bri  ))

        listView.adapter = PaymentAdapter(this,R.layout.row,list)
        listView.setOnItemClickListener{paymentAdapter, view, position, id ->
            val selectedItem = paymentAdapter.getItemAtPosition(position)
            val itemIdAtPos = paymentAdapter.getItemIdAtPosition(position)

            Toast.makeText(this@ListPaymentActivity,"Anda memilih item ke $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }
    }

    // my function to pass into the other
    fun buz(input: String) {
        println("another message: $input")
    }
}