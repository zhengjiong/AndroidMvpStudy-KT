package com.zj.example.mvp.view

/**
 * Created by zhengjiong
 * date: 2017/10/9 22:23
 */
interface BaseView<T> {
    fun setPresenter(presenter: T)
}