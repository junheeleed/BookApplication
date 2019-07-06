package com.example.bookapplication.ui.books

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.bookapplication.R
import com.example.bookapplication.util.addFragment

class BooksActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        addFragment(supportFragmentManager, R.id.framelayout, BooksFragment())
    }
}