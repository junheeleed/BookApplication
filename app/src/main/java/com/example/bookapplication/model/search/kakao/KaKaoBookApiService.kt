package com.example.bookapplication.model.search.kakao

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface KaKaoBookApiService {
    @GET("v3/search/book")
    @Headers("Authorization: KakaoAK 3ffed2566496c4dbaaac0d22255d16f2")
    fun getData(@Query("query") query: String, @Query("target") target: String,
                @Query("size") size: Int = 10, @Query("page") page: Int = 1): Call<ResponseData>
}

enum class Target (val value: String) {
    TITLE("title"),
    PUBLISHER("publisher"),
    PERSON("person")
}

class ResponseData(val documents: List<Document>)

data class Document(@SerializedName("title") val title: String,
                    @SerializedName("contents") val contents: String,
                    @SerializedName("url") val url: String,
                    @SerializedName("isbn") val isbn: String,
                    @SerializedName("datetime") val datetime: String,
                    @SerializedName("authors") val authors: List<String>,
                    @SerializedName("publisher") val publisher: String,
                    @SerializedName("translators") val translators: List<String>,
                    @SerializedName("price") val price: Int,
                    @SerializedName("sale_price") val salePrice: String,
                    @SerializedName("thumbnail") val thumbnail: String,
                    @SerializedName("status") val status: String) {
}