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

        //Ejercicio 1: Declaración de Variables
    /*    Declara variables para representar la información de un producto:

        Nombre del producto (String)
        Precio (Double)
        Disponible en inventario (Boolean)
        Código de producto (String) Imprime todas las variables.
*/
            val nombreProducto: String = "Laptop Gaming"
            val precio: Double = 1299.99
            val disponible: Boolean = true
            val codigoProducto: String = "LPT-001"

            println("Producto: $nombreProducto")
            println("Precio: $precio")
            println("Disponible: $disponible")
            println("Código: $codigoProducto")
        }
    }


