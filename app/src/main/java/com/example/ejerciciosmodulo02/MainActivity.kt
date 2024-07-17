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

        val num1 = 20
        val num2 = 6

        println("Suma: ${num1 + num2}")
        println("Resta: ${num1 - num2}")
        println("Multiplicación: ${num1 * num2}")
        println("División: ${num1 / num2}")
        println("Módulo: ${num1 % num2}")
        }
    }


