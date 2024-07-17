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

        val p = true
        val q = false
        val r = true

        println("p AND q: ${p && q}")
        println("p OR q: ${p || q}")
        println("NOT p: ${!p}")
        println("(p OR q) AND r: ${(p || q) && r}")
        }
    }


