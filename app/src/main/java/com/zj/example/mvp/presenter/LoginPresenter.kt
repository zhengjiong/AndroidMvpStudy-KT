package com.zj.example.mvp.presenter

/**
 * Created by zhengjiong
 * date: 2017/10/8 17:01
 */
interface LoginPresenter : BasePresenter {
    fun login(username: String, password: String)
}