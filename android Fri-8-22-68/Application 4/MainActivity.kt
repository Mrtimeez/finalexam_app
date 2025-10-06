package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(),OnClickListener {
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
        var a : Int
        var b : Int
        a = editText1.text.toString().toInt()
        b = editText2.text.toString().toInt()
        var obj = Class1()
        val answer = obj.addData(a,b)
        Toast.makeText(applicationContext,"The answer is ${answer}",Toast.LENGTH_LONG).show()
    }
}
//open class Class2{
//    open fun addData(value1 : Int,value2: Int) : Int {
//        return value1 + value2
//    }
//
//}