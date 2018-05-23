package com.example.johnry.daggersample.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.johnry.daggersample.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.container, SampleFragment(), "sample_fragment").commit()
    }
}
