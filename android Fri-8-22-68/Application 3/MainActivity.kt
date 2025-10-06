package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.edittext1)
        editText2 = findViewById(R.id.edittext2)
        button = findViewById(R.id.button1)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a: Int
        var b: Int
        var answer : Int
        a = editText1.text.toString().toInt()
        b = editText2.text.toString().toInt()
        answer = a + b
        Toast.makeText(applicationContext, answer.toString(), Toast.LENGTH_LONG).show()
    }

}