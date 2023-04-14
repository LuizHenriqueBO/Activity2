package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var input: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input = findViewById<EditText>(R.id.input)

    }

    fun onClick(view: View) {

        var text = input.text.toString()
        val intent = Intent(this, ShowData::class.java)
        val bundle = Bundle()

        bundle.putString("text", text)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}