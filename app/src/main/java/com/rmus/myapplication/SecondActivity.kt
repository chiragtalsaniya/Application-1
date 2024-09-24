package com.rmus.myapplication

import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class  SecondActivity : AppCompatActivity(){
    private lateinit var gestureDetector: GestureDetector
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle_SecondActivity", "onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    override fun onStart() {
        Log.d("LifeCycle_SecondActivity", "onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.d("LifeCycle_SecondActivity", "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d("LifeCycle_SecondActivity", "onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.d("LifeCycle_SecondActivity", "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("LifeCycle_SecondActivity", "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("LifeCycle_SecondActivity", "onDestroy")
        super.onDestroy()
    }



}