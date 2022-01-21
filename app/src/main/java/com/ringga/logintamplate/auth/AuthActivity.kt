package com.ringga.logintamplate.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ringga.logintamplate.R
import com.ringga.logintamplate.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding :ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentContainerAuth.id, LoginFragment())
                .commitNow()
        }
    }
}