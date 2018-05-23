package com.example.johnry.daggersample.di

import com.example.johnry.daggersample.ui.MainActivity
import com.example.johnry.daggersample.ui.SampleFragment
import dagger.Component

@Component(modules = [SampleModule::class, MultipleProviderModule::class])
interface SampleComponent {
    fun injectActivity(activity: MainActivity)
    fun injectFragment(fragment : SampleFragment)
}