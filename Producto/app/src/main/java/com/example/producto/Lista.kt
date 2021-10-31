package com.example.producto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.producto.databinding.ActivityListaBinding

class Lista : AppCompatActivity() {

    private lateinit var binding: ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}