package com.hoikhong.searchusergithubmvp.service

import com.dreamdev.simpleretrofit.models.UserResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface HttpService {

    @GET("search/users")
    fun searchUsers(@Query("q") q: String?): Observable<UserResponse>
}