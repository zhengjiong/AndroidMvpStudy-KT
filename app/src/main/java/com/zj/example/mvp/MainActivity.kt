package com.zj.example.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zj.example.mvp.presenter.LoginPresenterImpl
import com.zj.example.mvp.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by zhengjiong
 * Date: 2017/10/8 16:50
 */
class MainActivity : AppCompatActivity(), LoginView {
    lateinit var loginPresenter: LoginPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenterImpl(this)


        btnLogin.setOnClickListener {
            loginPresenter.login(editUsername.text.trim().toString(), editPassword.text.trim().toString())
        }
    }

    override fun loginSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
    }

    override fun loginFailure(error: String) {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show()
    }
}
