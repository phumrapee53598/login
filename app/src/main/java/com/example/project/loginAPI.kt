package com.example.project

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

abstract class loginAPI {

    @FormUrlEncoded
    @POST("login")
    abstract fun loginUser(
        @Field("username") username:String,
        @Field("password") password:String) : Call<User>
}