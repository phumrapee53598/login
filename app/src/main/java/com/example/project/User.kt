package com.example.project

import com.example.loginnapp.Ecpose
import com.google.gson.annotations.SerializedName


class User (
    @Ecpose
    @SerializedName("username")val username : String,

    @Ecpose
    @SerializedName("password")val password : String
){}