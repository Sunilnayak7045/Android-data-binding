package com.example.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    //activity_main.xml is renamed ActivityMainBinding with suffix Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // instead of this --> setContentView(R.layout.activity_main)
        // use binding object
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        // method 1 (perform without layout data variable in xml)
        binding.quotesText.text= "qwertyuiop"
        binding.quotesAuthor.text= "abc"


        // method 2
        val quoteObj = Quotes("qwertyuiopp","abc")
        binding.quote=quoteObj  //quote is data-variable name



      //Changed made by sunil on featured branch



        //other commit made by me before push

    }
}