package com.example.bookapplication.model.search.data

import java.io.Serializable


data class Book(val title: String?,
                val contents: String?,
                val url: String?,
                val isbn: String?,
                val datetime: String?,
                val authors: List<String>?,
                val publisher: String?,
                val translators: List<String>?,
                val price: Int?,
                val salePrice: String?,
                val thumbnail: String?,
                val status: String?) : Serializable{
}