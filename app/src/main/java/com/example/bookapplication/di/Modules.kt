package com.example.bookapplication.di

import com.example.bookapplication.model.search.kakao.KaKaoBookSearcher
import com.example.bookapplication.model.repository.BookRepository
import com.example.bookapplication.model.repository.BookRepositorylmpl
import com.example.bookapplication.ui.books.BooksContract
import com.example.bookapplication.ui.books.BooksFragment
import com.example.bookapplication.ui.books.BooksPresenter
import org.koin.dsl.module

val presenterModule = module {
    factory<BooksContract.Presenter> { (view: BooksFragment) -> BooksPresenter(view, get()) }
}

val repositoryModule= module {
    factory<BookRepository> { BookRepositorylmpl(KaKaoBookSearcher()) }
}