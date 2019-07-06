package com.example.bookapplication.model.repository

import com.example.bookapplication.model.search.WebBookSearchable

interface BookRepository {
    fun getByTitle(title: String, callback: WebBookSearchable.Callback)
    fun getByPublisher(publisher: String, callback: WebBookSearchable.Callback)
    fun getByPerson(person: String, callback: WebBookSearchable.Callback)
}