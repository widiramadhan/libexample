package com.example.libexample

import android.content.Context
import android.util.Log
import android.widget.Toast


class LibDebug {
    companion object Builder {
        private const val TAG = "LIB_EXAMPLE_ANDROID"

        fun i(message:String){
            Log.i(TAG, message)
        }

        fun showToast(context: Context?, message: String?) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}