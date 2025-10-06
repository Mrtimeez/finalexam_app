package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var editText: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.edittext1)
        button = findViewById(R.id.button1)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var i : Int
        i = editText.text.toString().toInt()
        i++
        Toast.makeText(this, i.toString(), Toast.LENGTH_LONG).show()
    }
}