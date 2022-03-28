package com.example.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesText_var= findViewById<TextView>(R.id.quotesText)
        val quotesAuthor_var= findViewById<TextView>(R.id.quotesAuthor)

        quotesText_var.text= "qwertyuiop"
        quotesAuthor_var.text= "abc"



    }
}