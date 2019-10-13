package com.example.gpsbasedprofiling

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, AutoMainActivity::class.java)
        startActivity(intent)
    }
}
