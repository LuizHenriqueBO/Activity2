package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ShowData : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        val textView = findViewById<TextView>(R.id.textView)
        val propsMessage = intent.extras?.getString("text") ?: ""
        textView.text = propsMessage
    }

    fun goBack(view: View) {
        finish()
    }
}