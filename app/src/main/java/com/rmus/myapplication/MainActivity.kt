package com.rmus.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LifeCycle_MainActivity", "onCreate")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editText = findViewById<EditText>(R.id.editTextNumber)
        val editText2 = findViewById<EditText>(R.id.editTextNumber2)
        val addButton = findViewById<Button>(R.id.addButton)


        addButton.setOnClickListener {
            Log.d("MainActivity", "Add Button Clicked")
            Log.d("MainActivity", "Add Button Clicked")
            Log.d("MainActivity", "Add Button Clicked")
            Log.d("MainActivity", "Add Button Clicked")

            val num1 = editText.text.toString().toInt()
            val num2 = editText2.text.toString().toInt()

            addTwoNumber(num2,num1)
        }


    }

    private fun addTwoNumber(num2: Int, num1: Int) {
        val ansTextView = findViewById<TextView>(R.id.ansTextView)
        val sum = num1 + num2
        ansTextView.text = "Addition : $sum"
        Toast.makeText(this, "Addition : $sum", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
       
        super.onStart()
    }

    override fun onPause() {
        
        super.onPause()
    }

    override fun onResume() {
      
        super.onResume()
    }

    override fun onStop() {
      
        super.onStop()
    }

    override fun onRestart() {
        Log.d("LifeCycle_MainActivity", "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("LifeCycle_MainActivity", "onDestroy")
        super.onDestroy()
    }


}
