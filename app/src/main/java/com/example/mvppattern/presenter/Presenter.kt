package com.example.mvppattern.presenter

import com.example.mvppattern.model.User
import com.example.mvppattern.view.IView

class Presenter(private val loginView: IView): IPresenter {

    override fun OnLogin(email: String?, password: String?) {
        val user = User(email, password)

        when (user.isValid()) {
            0 -> {
                loginView.OnLoginError("Please enter Email");
            }
            1 -> {
                loginView.OnLoginError("Please enter A valid Email");
            }
            2 -> {
                loginView.OnLoginError("Please enter Password");
            }
            3 -> {
                loginView.OnLoginError("Please enter Password greater the 6 char");
            }
            else -> {
                loginView.OnLoginSuccess("login Successful");
            }
        }
    }

}