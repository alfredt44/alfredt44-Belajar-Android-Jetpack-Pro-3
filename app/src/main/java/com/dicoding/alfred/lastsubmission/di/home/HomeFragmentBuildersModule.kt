package com.dicoding.alfred.lastsubmission.di.home

import com.dicoding.alfred.lastsubmission.di.home.favorite.FavoriteFragmentBuildersModule
import com.dicoding.alfred.lastsubmission.ui.home.content.favorite.FavoriteFragment
import com.dicoding.alfred.lastsubmission.ui.home.content.movie.MovieFragment
import com.dicoding.alfred.lastsubmission.ui.home.content.tvshow.TvShowFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovieFragment() : MovieFragment

    @ContributesAndroidInjector
    abstract fun contributeTvShowFragment() : TvShowFragment

    @ContributesAndroidInjector(modules  =  [FavoriteFragmentBuildersModule::class])
    abstract fun contributeFavoriteFragment() : FavoriteFragment
}