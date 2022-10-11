package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var answer: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        onClick()
    }

    private fun init() {
        editText = findViewById(R.id.editTextNumber)
        editText2 = findViewById(R.id.editTextNumber2)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
    }


    private fun onClick() {

        button.setOnClickListener {
            val result = editText.text.toString().toInt() + editText2.text.toString().toInt()
            answer = result.toString()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("answer", answer)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val result = editText.text.toString().toInt() - editText2.text.toString().toInt()
            answer = result.toString()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("answer", answer)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val result = editText.text.toString().toInt() * editText2.text.toString().toInt()
            answer = result.toString()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("answer", answer)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val result = editText.text.toString().toDouble() / editText2.text.toString().toDouble()
            answer = result.toString()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("answer", answer)
            startActivity(intent)
        }
    }
}