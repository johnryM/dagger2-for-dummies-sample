package com.example.johnry.daggersample.di

import com.example.johnry.daggersample.stuff.InfoWithArguement
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MultipleProviderModule {
    @Provides @Named("info_arg_one")
    fun provideInfoArgOne() : InfoWithArguement {
        return InfoWithArguement("Hello from Multi provider one")
    }

    @Provides @Named("info_arg_two")
    fun provideInfoArgTwo() : InfoWithArguement {
        return InfoWithArguement("Hello from Multi provider two")
    }
}