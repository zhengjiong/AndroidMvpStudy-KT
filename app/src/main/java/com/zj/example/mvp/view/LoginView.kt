package com.zj.example.mvp.view

/**
 * Created by zhengjiong
 * date: 2017/10/8 17:14
 */

interface LoginView {
    fun loginSuccess()
    fun loginFailure(error: String)
}