package com.dicoding.alfred.lastsubmission.di.home.favorite

import com.dicoding.alfred.lastsubmission.ui.home.content.favorite.movie.FavoriteMovieFragment
import com.dicoding.alfred.lastsubmission.ui.home.content.favorite.tvshow.FavoriteTvShowFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FavoriteFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeFavoriteMovieFragment() : FavoriteMovieFragment

    @ContributesAndroidInjector
    abstract fun contributeFavoriteTvShowFragment() : FavoriteTvShowFragment
}