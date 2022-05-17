package com.dzakyhdr.authentication

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserDataStoreManager(private val context: Context) {




    companion object {
        private const val DATASTORE_NAME = "user_preference"
        private val ID_KEY = intPreferencesKey("id_key")
        private val STATUS_KEY = booleanPreferencesKey("status_key")

        private val Context.userDataStore by preferencesDataStore(
            name = DATASTORE_NAME
        )
    }
}