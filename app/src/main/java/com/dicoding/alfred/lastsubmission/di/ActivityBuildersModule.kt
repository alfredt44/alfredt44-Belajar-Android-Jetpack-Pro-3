package com.dicoding.alfred.lastsubmission.di

import com.dicoding.alfred.lastsubmission.di.home.HomeFragmentBuildersModule
import com.dicoding.alfred.lastsubmission.ui.detail.DetailActivity
import com.dicoding.alfred.lastsubmission.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules  =  [HomeFragmentBuildersModule::class])
    abstract fun contributeHomeActivity(): HomeActivity

    @ContributesAndroidInjector
    abstract fun contributeDetailActivity(): DetailActivity

}