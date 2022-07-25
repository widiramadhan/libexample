package com.example.libexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class ListPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_payment)

        val payment:Array<String> = resources.getStringArray(R.array.payment_list)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,payment)

        var listView = findViewById(R.id.listView) as ListView

        listView.adapter = arrayAdapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }
    }
}