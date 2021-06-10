package com.sunidhi.moviemvvm.api

import com.sunidhi.moviemvvm.helper.Constants
import com.sunidhi.moviemvvm.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>
}

