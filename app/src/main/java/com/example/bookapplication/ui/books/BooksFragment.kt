package com.example.bookapplication.ui.books

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.SearchView
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.bookapplication.R
import com.example.bookapplication.model.search.data.Book

import com.example.bookapplication.databinding.FragmentBooksBinding
import com.example.bookapplication.ui.IntentKeys
import com.example.bookapplication.ui.SearchType
import com.example.bookapplication.ui.detail.BookDetailActivity
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf


class BooksFragment: Fragment(), BooksContract.View {

    private lateinit var dataBinding: FragmentBooksBinding
    private lateinit var bookAdapter: BookAdapter
    private var books: MutableList<Book> = mutableListOf()
    private val presenter: BooksContract.Presenter by inject { parametersOf(this@BooksFragment) }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = FragmentBooksBinding.inflate(inflater, container, false)
        bookAdapter = BookAdapter(books, onItemClickListener)
        dataBinding.recyclerview.adapter = bookAdapter
        dataBinding.searchView.setOnQueryTextListener(onQueryTExtListener)
        return dataBinding.root
    }

    override fun setProgressbarVisibility(visibility: Int) {
        dataBinding.bookProgressbar.visibility = visibility
    }

    override fun updateRecyclerView(books: List<Book>) {
        if (this.books.size > 0) this.books.clear()
        this.books.addAll(books)
        bookAdapter.notifyDataSetChanged()
    }

    override fun showToast(message: Int) {
        Toast.makeText(context, resources.getString(message), Toast.LENGTH_SHORT).show()
    }

    private val onQueryTExtListener: SearchView.OnQueryTextListener = object : SearchView.OnQueryTextListener{
        override fun onQueryTextSubmit(query: String): Boolean {

            when (dataBinding.searchTypeSpinner.selectedItem.toString()) {
                SearchType.TITLE.value -> presenter.searchBookByTitle(query)
                SearchType.PUBLISHER.value -> presenter.searchBookByPublisher(query)
                SearchType.PERSON.value -> presenter.searchBookByPerson(query)
            }
            return false
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            return false
        }
    }

    private val onItemClickListener  = object : BookAdapter.OnItemClickListener {
        override fun onItemClick(book: Book) {
            startActivity(Intent(activity,  BookDetailActivity::class.java).apply {
                this.putExtra(IntentKeys.selected_item_key, book)
            })
        }
    }
}