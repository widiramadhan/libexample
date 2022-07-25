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

        list.add(PaymentModel("Title One",   "Description One...",   R.mipmap.ic_launcher  ))
        list.add(PaymentModel("Title Two",   "Description Two...",   R.mipmap.ic_launcher_round  ))
        list.add(PaymentModel("Title Three", "Description Three...", R.mipmap.ic_launcher  ))
        list.add(PaymentModel("Title Four",  "Description Four...",  R.mipmap.ic_launcher_round  ))
        list.add(PaymentModel("Title Five",  "Description Five...",  R.mipmap.ic_launcher  ))

        listView.adapter = PaymentAdapter(this,R.layout.row,list)
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }
    }
}