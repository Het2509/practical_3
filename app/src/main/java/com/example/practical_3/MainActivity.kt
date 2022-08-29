package com.example.practical_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun LaunchSecondActivity(view: View) {
        intent=Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}