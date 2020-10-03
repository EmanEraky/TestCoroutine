package com.eman.testcoroutine.data.api

import com.eman.testcoroutine.data.model.ApiUser
import retrofit2.http.GET

interface ApiServices {
    @GET("users")
    suspend fun getUsers(): List<ApiUser>

    @GET("more-users")
    suspend fun getMoreUsers(): List<ApiUser>

    @GET("error")
    suspend fun getUsersWithError(): List<ApiUser>
}