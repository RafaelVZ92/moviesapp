package com.example.gonetexam.core.base

import com.example.gonetexam.App
import com.example.gonetexam.BuildConfig
import com.example.gonetexam.api.ApiManagerFactory
import com.example.gonetexam.api.ResponseHandler

open class BaseRepository{
    val application = App.instance
    var service = ApiManagerFactory.makeRetrofitService(BuildConfig.BASE_URL)
    var loadImage = ApiManagerFactory.makeRetrofitService("https://image.tmdb.org/t/p/w500/")
    val apiKey = "08425cd314576d2ad6072d596f49b16c"
    val responseHandler: ResponseHandler = ResponseHandler()
}