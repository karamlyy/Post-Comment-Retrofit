package com.example.retrofittask20.api
import com.example.retrofittask20.model.Comment
import com.example.retrofittask20.model.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("posts")
    fun getPosts(): Call<List<Post?>?>?

    @GET("comments")
    fun getComments(@Query("postId")postId : Int): Call<List<Comment?>?>?


}