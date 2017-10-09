package com.zj.example.mvp.presenter

import com.zj.example.mvp.LoginContract


/**
 * Created by zhengjiong
 * date: 2017/10/8 17:02
 */
class Presenter(val view: LoginContract.View) : LoginContract.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun login(username: String, password: String) {
        if (username === "zj" && password === "123456") {
            view.loginSuccess()
        } else {
            view.loginFailure("账号密码错误")
        }
    }

    override fun start() {

    }
}