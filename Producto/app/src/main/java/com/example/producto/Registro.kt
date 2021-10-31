package com.example.producto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.producto.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {

            
        }
    }
}