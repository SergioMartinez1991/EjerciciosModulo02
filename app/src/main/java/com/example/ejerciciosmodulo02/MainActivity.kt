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

        val peso = 70.0 // kg
        val altura = 1.75 // metros
        val imc = peso / (altura * altura)

        println("IMC: ${"%.2f".format(imc)}")
        }
    }


