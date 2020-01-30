package com.app.safariwallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        alreadyhaveaccount_tv_register.setOnClickListener {
            val back=Intent(this,LoginActivity::class.java)
            startActivity(back)
        }
    }
}
