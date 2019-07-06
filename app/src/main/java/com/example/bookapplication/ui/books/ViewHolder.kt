package com.example.bookapplication.ui.books

import android.support.v7.widget.RecyclerView
import android.view.View

import com.example.bookapplication.model.search.data.Book
import com.example.bookapplication.databinding.RecyclerBookItemBinding
import com.example.bookapplication.util.fromUrl

class ViewHolder(private val dataBinding: RecyclerBookItemBinding,
                 private val listener: BookAdapter.OnItemClickListener): RecyclerView.ViewHolder(dataBinding.root) {

    lateinit var book: Book

    fun init(book: Book) {
        this.book = book
        dataBinding.viewholder = this
        dataBinding.bookImage.fromUrl(book.thumbnail.toString())
        itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                listener.onItemClick(book)
            }
        })
    }
}