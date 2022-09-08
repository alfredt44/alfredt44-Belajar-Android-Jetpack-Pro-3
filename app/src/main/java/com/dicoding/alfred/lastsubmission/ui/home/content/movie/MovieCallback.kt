package com.dicoding.alfred.lastsubmission.ui.home.content.movie

import com.dicoding.alfred.lastsubmission.data.source.local.entity.MovieEntity

interface MovieCallback {
    fun onItemClicked(data: MovieEntity)
}