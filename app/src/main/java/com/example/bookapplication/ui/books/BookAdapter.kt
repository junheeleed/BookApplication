package com.example.bookapplication.ui.books

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.bookapplication.model.search.data.Book
import com.example.bookapplication.databinding.RecyclerBookItemBinding

class BookAdapter(private var books: List<Book>, private val listener: OnItemClickListener)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(book: Book)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): RecyclerView.ViewHolder
    = ViewHolder(RecyclerBookItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false), listener)

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        (viewHolder as ViewHolder).init(books.get(position))
    }

    override fun getItemCount(): Int = books.size
}