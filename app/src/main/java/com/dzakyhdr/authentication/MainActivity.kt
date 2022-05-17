package com.dzakyhdr.authentication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dzakyhdr.authentication.databinding.ActivityMainBinding
import com.dzakyhdr.authentication.utils.Status
import com.dzakyhdr.authentication.viewmodel.MainViewModel
import com.dzakyhdr.authentication.viewmodel.MainViewModelFactory
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userDataStoreManager = UserDataStoreManager(this)


    }
}