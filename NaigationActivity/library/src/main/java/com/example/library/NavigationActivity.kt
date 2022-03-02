package com.example.library

import android.content.Context
import android.widget.Toast

class NavigationActivity {
    companion object {
        fun longToast(context: Context, msg: String) = Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        fun shortToast(context: Context, msg: String) = Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}