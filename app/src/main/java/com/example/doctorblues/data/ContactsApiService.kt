package com.example.doctorblues.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://public.syntax-institut.de/apps/batch4/Oliver/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()


interface ContactsApiService {

    @GET("contacts.json")
    suspend fun getContacts(): List<Contacts>
    @GET("questions.json")
    suspend fun getQuestion(): List<Questions>

}

object Api {
    val retrofitService: ContactsApiService by lazy { retrofit.create(ContactsApiService::class.java) }
}