package com.example.mvppattern.view

interface IView {
    fun OnLoginSuccess(message: String?)
    fun OnLoginError(message: String?)
}