package com.dzakyhdr.authentication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dzakyhdr.authentication.data.UserEntity
import com.dzakyhdr.authentication.databinding.ActivityRegisterBinding
import com.dzakyhdr.authentication.viewmodel.RegisterViewModel
import com.dzakyhdr.authentication.viewmodel.RegisterViewModelFactory
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}