package com.app.safariwallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signup_tv_login.setOnClickListener {
            val sign=Intent(this,RegisterActivity::class.java
            )
            startActivity(sign)
        }
        signin_btn_login.setOnClickListener {
            val signin=Intent(this,Home::class.java)
            startActivity(signin)
        }
    }
}
