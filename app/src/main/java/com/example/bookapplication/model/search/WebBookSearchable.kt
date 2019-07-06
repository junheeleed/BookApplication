package com.example.bookapplication.model.search

import com.example.bookapplication.model.search.data.Book

interface WebBookSearchable {
    fun getByTitle(title: String, callback: Callback)
    fun getByPublisher(publisher: String, callback: Callback)
    fun getByPerson(person: String, callback: Callback)

    interface Callback {
        fun succeed(books: List<Book>)
        fun failed(errorCode: Int)
    }
}