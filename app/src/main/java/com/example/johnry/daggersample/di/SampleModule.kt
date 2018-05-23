package com.example.johnry.daggersample.di

import com.example.johnry.daggersample.stuff.InfoWithArguement
import dagger.Module
import dagger.Provides

@Module
class SampleModule {
    @Provides
    fun providesInfoArguement() : InfoWithArguement {
        return InfoWithArguement("Hello world from SampleModule provider")
    }
}