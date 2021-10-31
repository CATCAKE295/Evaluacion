package com.example.producto

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.producto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnIRegistro.setOnClickListener{

            verVistaRegistro()
        }

        binding.btnILista.setOnClickListener {

            verVistaLista()
        }

    }

    private fun verVistaLista() {
        startActivity(Intent(this,Lista::class.java))
    }

    private fun verVistaRegistro() {
        startActivity(Intent(this,Registro::class.java))
    }

}