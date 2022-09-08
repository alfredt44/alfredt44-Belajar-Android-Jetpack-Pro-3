package com.dicoding.alfred.lastsubmission.ui.home.content.tvshow

import com.dicoding.alfred.lastsubmission.data.source.local.entity.TvShowEntity

interface TvShowCallback {
    fun onItemClicked(data: TvShowEntity)
}