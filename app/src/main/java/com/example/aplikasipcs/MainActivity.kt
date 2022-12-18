package com.example.aplikasipcs

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var var1=findViewById<EditText>(R.id.var1)
        var var2=findViewById<EditText>(R.id.var2)
        var button=findViewById<Button>(R.id.button)
        var hasil=findViewById<TextView>(R.id.hasil)

        button.setOnClickListener() {
            var input1= var1.text.toString().toInt()
            var input2= var2.text.toString().toInt()
            val hitung=input1+input2

            hasil.text=hitung.toString()
        }

    }

}