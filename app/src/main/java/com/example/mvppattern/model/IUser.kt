package com.example.mvppattern.model

interface IUser {
    fun getEmail(): String?
    fun getPassword(): String?
    fun isValid(): Int
}