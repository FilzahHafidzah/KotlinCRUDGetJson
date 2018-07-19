package com.filzah.kotlinrestorancrud.server

import com.filzah.kotlinrestorancrud.response.ResponOwner
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("users/hadley/repos")
    fun requestOwner():Call<List<ResponOwner>>
}
