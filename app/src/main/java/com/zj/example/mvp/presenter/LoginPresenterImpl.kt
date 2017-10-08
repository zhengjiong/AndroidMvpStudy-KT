package com.zj.example.mvp.presenter

import com.zj.example.mvp.view.LoginView

/**
 * Created by zhengjiong
 * date: 2017/10/8 17:02
 */
class LoginPresenterImpl(val loginView: LoginView) : LoginPresenter {

    override fun login(username: String, password: String) {
        if (username === "zj" && password === "123456") {
            loginView.loginSuccess()
        } else {
            loginView.loginFailure("账号密码错误")
        }
    }
}