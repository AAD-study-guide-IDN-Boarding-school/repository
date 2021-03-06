package com.dzakyhdr.authentication.data

class UserRepository(private val userDao: UserDao) {



    companion object {
        @Volatile
        private var instance: UserRepository? = null
        fun getInstance(
            userDao: UserDao
        ): UserRepository =
            instance ?: synchronized(this) {
                instance ?: UserRepository(userDao)
            }.also { instance = it }
    }
}