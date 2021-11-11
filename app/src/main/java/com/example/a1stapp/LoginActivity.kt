package com.example.a1stapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}