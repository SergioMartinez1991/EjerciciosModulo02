package com.example.ejerciciosmodulo02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val numeroString = "42"
        val numeroInt = numeroString.toInt()
        val numeroDouble = numeroInt.toDouble()

        println("Int + 10: ${numeroInt + 10}")
        println("Double + 10.5: ${numeroDouble + 10.5}")
        }
    }


