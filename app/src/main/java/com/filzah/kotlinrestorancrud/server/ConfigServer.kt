package com.filzah.kotlinrestorancrud.server

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class ConfigServer {
    var retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java)!!
}