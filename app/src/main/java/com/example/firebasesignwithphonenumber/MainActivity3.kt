package com.example.firebasesignwithphonenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebasesignwithphonenumber.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy { ActivityMain3Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.log.setOnClickListener {
            finish()
        }
    }
}