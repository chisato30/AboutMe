package com.example.aboutme2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
private fun addNickname(view: View) {
    val editText = findViewById<EditText>(R.id.nickname_edit)
    val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
}
