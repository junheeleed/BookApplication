package com.example.bookapplication.ui.books

import android.view.View
import com.example.bookapplication.R
import com.example.bookapplication.model.search.data.Book
import com.example.bookapplication.model.repository.BookRepository
import com.example.bookapplication.model.search.WebBookSearchable
import com.example.bookapplication.util.MainThreadExecutor

class BooksPresenter(private val view: BooksContract.View, private val bookRepository: BookRepository)
    : BooksContract.Presenter {

    override fun searchBookByTitle(title: String) {
        view.setProgressbarVisibility(View.VISIBLE)
        bookRepository.getByTitle(title, webBookSearchCallback)
    }

    override fun searchBookByPublisher(publisher: String) {
        view.setProgressbarVisibility(View.VISIBLE)
        bookRepository.getByPublisher(publisher, webBookSearchCallback)
    }

    override fun searchBookByPerson(person: String) {
        view.setProgressbarVisibility(View.VISIBLE)
        bookRepository.getByPerson(person, webBookSearchCallback)
    }

    private val webBookSearchCallback: WebBookSearchable.Callback = object : WebBookSearchable.Callback{
        override fun succeed(books: List<Book>) {
            MainThreadExecutor.execute(object : Runnable {
                override fun run() {
                    view.setProgressbarVisibility(View.INVISIBLE)
                    if (books.size == 0) {
                        view.showToast(R.string.search_book_nothing)
                        return
                    }
                    view.updateRecyclerView(books)
                }
            })
        }

        override fun failed(errorCode: Int) {
            MainThreadExecutor.execute(object : Runnable {
                override fun run() {
                    view.setProgressbarVisibility(View.INVISIBLE)
                    when (errorCode) {
                        else -> view.showToast(R.string.search_book_failed)
                    }
                }
            })
        }
    }
}