package com.example.conversoeuroparadolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversoeuroparadolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros = binding.editEuro.text.toString().toDouble()
            val dolares = String.format("%.2f", euros * 0.8)
            val nameValue = "Valor: "
            binding.textDolares.text = nameValue + dolares
        }


    }
}