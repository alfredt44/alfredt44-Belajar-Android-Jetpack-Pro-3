package com.dicoding.alfred.lastsubmission.data.source

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.dicoding.alfred.lastsubmission.data.source.local.entity.MovieEntity
import com.dicoding.alfred.lastsubmission.data.source.local.entity.TvShowEntity
import com.dicoding.alfred.lastsubmission.vo.Resource

interface CatalogDataSource {

    fun getNowPlayingMovies(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getListFavoriteMovies(): LiveData<PagedList<MovieEntity>>

    fun getMovieDetail(movieId: Int): LiveData<MovieEntity>

    fun getTvShowOnTheAir(): LiveData<Resource<PagedList<TvShowEntity>>>

    fun getListFavoriteTvShows(): LiveData<PagedList<TvShowEntity>>

    fun getTvShowDetail(tvShowId: Int): LiveData<TvShowEntity>

    fun setFavoriteMovie(movie: MovieEntity)

    fun setFavoriteTvShow(tvShow: TvShowEntity)

}