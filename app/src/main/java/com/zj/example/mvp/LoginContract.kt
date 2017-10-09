package com.zj.example.mvp

import com.zj.example.mvp.presenter.BasePresenter
import com.zj.example.mvp.view.BaseView


/**
 * Created by zhengjiong
 * date: 2017/10/9 22:34
 */
interface LoginContract {

    interface View : BaseView<Presenter> {
        fun loginSuccess()
        fun loginFailure(error: String)
    }

    interface Presenter : BasePresenter {
        fun login(username: String, password: String)
    }

}