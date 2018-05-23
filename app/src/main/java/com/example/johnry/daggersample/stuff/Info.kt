package com.example.johnry.daggersample.stuff

import javax.inject.Inject

class Info @Inject constructor(){
    fun getMessage() = "Hello World"
}