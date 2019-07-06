package com.example.bookapplication.model.repository

import com.example.bookapplication.model.search.WebBookSearchable
import com.example.bookapplication.util.ThreadExecutor

class BookRepositorylmpl(private val webBookSearchable: WebBookSearchable): BookRepository {

    override fun getByTitle(title: String, callback: WebBookSearchable.Callback) {
        ThreadExecutor.executeSingleThread(object : Runnable {
            override fun run() {
                webBookSearchable.getByTitle(title, callback)
            }
        })
    }

    override fun getByPublisher(publisher: String, callback: WebBookSearchable.Callback) {
        ThreadExecutor.executeSingleThread(object : Runnable {
            override fun run() {
                webBookSearchable.getByPublisher(publisher, callback)
            }
        })
    }

    override fun getByPerson(person: String, callback: WebBookSearchable.Callback) {
        ThreadExecutor.executeSingleThread(object : Runnable {
            override fun run() {
                webBookSearchable.getByPerson(person, callback)
            }
        })
    }
}