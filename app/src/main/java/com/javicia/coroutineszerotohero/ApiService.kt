package com.javicia.coroutineszerotohero

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/10229233666327556/search/{name}")
    fun getSuperHero(@Path("name")superHeroName:String): Response<SuperHeroDataResponse>
}

//Esta data class debería ir en otra clase
data class SuperHeroDataResponse(@SerializedName("response") val response:String)