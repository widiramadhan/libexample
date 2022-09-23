package com.finpay.sdk.ui

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.finpay.sdk.adapter.PaymentAdapter
import com.finpay.sdk.model.PaymentModel
import com.finpay.sdk.R

class TopUpActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup)

        setTitle("ISI SALDO")

        listView = findViewById(R.id.list_payment)
        var list = mutableListOf<PaymentModel>()
        list.add(PaymentModel(R.drawable.kartudebit, "Kartu Debit"))
        list.add(PaymentModel(R.drawable.bank_svg, "ATM"))
        list.add(PaymentModel(R.drawable.mobilebanking_svg, "Internet / Mobile Banking"))
        listView.adapter = PaymentAdapter(this,R.layout.item_payment_method,list)
        listView.setOnItemClickListener{paymentAdapter, view, position, id ->
            val selectedItem = paymentAdapter.getItemAtPosition(position)
            val itemIdAtPos = paymentAdapter.getItemIdAtPosition(position)

            //Toast.makeText(this@,"Anda memilih item ke $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }


    }
}