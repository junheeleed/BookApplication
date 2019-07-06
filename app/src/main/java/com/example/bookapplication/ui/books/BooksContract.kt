package com.example.bookapplication.ui.books

import com.example.bookapplication.model.search.data.Book

interface BooksContract {

    interface View {
        fun setProgressbarVisibility(visibility: Int)
        fun updateRecyclerView(books: List<Book>)
        fun showToast(message: Int)
    }

    interface Presenter {
        fun searchBookByTitle(title: String)
        fun searchBookByPublisher(publisher: String)
        fun searchBookByPerson(person: String)
    }
}