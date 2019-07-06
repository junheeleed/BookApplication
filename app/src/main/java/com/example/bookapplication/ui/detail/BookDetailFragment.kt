package com.example.bookapplication.ui.detail

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookapplication.model.search.data.Book

import com.example.bookapplication.databinding.FragmentBookDetailBinding
import com.example.bookapplication.ui.IntentKeys
import com.example.bookapplication.util.fromUrl

class BookDetailFragment: Fragment() {

    private lateinit var binding: FragmentBookDetailBinding
    lateinit var book: Book

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBookDetailBinding.inflate(inflater, container, false).apply {
            fragment = this@BookDetailFragment
        }
        book = arguments!!.getSerializable(IntentKeys.selected_item_key) as Book
        binding.image.fromUrl(book.thumbnail.toString())
        return binding.root
    }
}