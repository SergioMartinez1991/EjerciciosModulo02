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

        val str1 = "Hola"
        val str2 = "Mundo"
        println("Concatenación: ${str1 + " " + str2}")
        println("Son iguales: ${str1 == str2}")
        println("Suma de longitudes: ${str1.length + str2.length}")
        }
    }


