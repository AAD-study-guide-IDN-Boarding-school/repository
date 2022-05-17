package com.dzakyhdr.authentication.viewmodel

import androidx.lifecycle.*
import com.dzakyhdr.authentication.UserDataStoreManager
import com.dzakyhdr.authentication.data.UserEntity
import com.dzakyhdr.authentication.data.UserRepository
import com.dzakyhdr.authentication.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: UserRepository,
    private val pref: UserDataStoreManager
) : ViewModel() {


}