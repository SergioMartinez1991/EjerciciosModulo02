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

        var numero = 10
        numero += 5
        println("Después de sumar 5: $numero")
        numero *= 2
        println("Después de multiplicar por 2: $numero")
        numero -= 3
        println("Después de restar 3: $numero")
        numero /= 4
        println("Después de dividir entre 4: $numero")
        }
    }


