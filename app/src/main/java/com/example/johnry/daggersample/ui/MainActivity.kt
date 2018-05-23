package com.example.johnry.daggersample.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.johnry.daggersample.R
import com.example.johnry.daggersample.di.DaggerSampleComponent
import com.example.johnry.daggersample.stuff.Info
import com.example.johnry.daggersample.stuff.InfoWithArguement
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info
    @Inject
    lateinit var infoWithArguement: InfoWithArguement


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSampleComponent.create().injectActivity(this)
        textTitle.text = info.getMessage()
        textTitleArguement.text = infoWithArguement.message
    }

    fun openSecondActivity(view : View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
