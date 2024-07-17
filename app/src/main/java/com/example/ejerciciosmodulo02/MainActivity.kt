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

        val a = 15
        val b = 20
        println("a es igual a b: ${a == b}")
        println("a es mayor que b: ${a > b}")
        println("b es menor o igual que a: ${b <= a}")
        }
    }


