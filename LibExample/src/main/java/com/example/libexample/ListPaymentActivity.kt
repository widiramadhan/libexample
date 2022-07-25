package com.example.libexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class ListPaymentActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_payment)

        listView = findViewById(R.id.listView)

        var list = mutableListOf<PaymentModel>()

        list.add(PaymentModel("Bank Central Asia (BCA)",   "Description for BCA...",   R.drawable.ic_bca  ))
        list.add(PaymentModel("Artha Graha Internasional",   "Description for AGI...",   R.drawable.ic_agi  ))
        list.add(PaymentModel("ATM Bersama", "Description for ATM Bersama...", R.drawable.ic_atm_bersama  ))
        list.add(PaymentModel("BNI",  "Description for BNI...",  R.drawable.ic_bni  ))
        list.add(PaymentModel("BRI",  "Description for BRI...",  R.drawable.ic_bri  ))

        listView.adapter = PaymentAdapter(this,R.layout.row,list)
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }
//        listView.setOnItemClickListener{paymentAdapter, view, position, id ->
//            val selectedItem = paymentAdapter.getItemAtPosition(position)
//            val itemIdAtPos = paymentAdapter.getItemIdAtPosition(position)
//
//            Toast.makeText(this@ListPaymentActivity,"Anda memilih $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
//        }
    }
}