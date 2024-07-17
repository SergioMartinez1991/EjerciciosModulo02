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

        val precioOriginal = 100.0
        val porcentajeDescuento = 20
        val descuento = precioOriginal * porcentajeDescuento / 100
        val precioFinal = precioOriginal - descuento

        println("Precio original: $precioOriginal")
        println("Descuento: $descuento")
        println("Precio final: $precioFinal")
        }
    }


