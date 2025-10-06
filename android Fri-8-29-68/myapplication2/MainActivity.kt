package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var textView: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.button1)
        editText = findViewById(R.id.edittext1)
        button = findViewById(R.id.button1)
        button.setOnClickListener {
            val input = editText.text.toString()
            if(input.isNotEmpty()){
                Toast.makeText(applicationContext,input,Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,"Error",Toast.LENGTH_LONG).show()
            }
        }
    }
}