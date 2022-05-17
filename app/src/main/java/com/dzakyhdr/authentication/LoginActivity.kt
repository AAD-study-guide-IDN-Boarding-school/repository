package com.dzakyhdr.authentication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dzakyhdr.authentication.databinding.ActivityLoginBinding
import com.dzakyhdr.authentication.utils.Status
import com.dzakyhdr.authentication.viewmodel.LoginViewModel
import com.dzakyhdr.authentication.viewmodel.LoginViewModelFactory
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userDataStoreManager = UserDataStoreManager(this)


        binding.txtToLogin.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }



    }

}
