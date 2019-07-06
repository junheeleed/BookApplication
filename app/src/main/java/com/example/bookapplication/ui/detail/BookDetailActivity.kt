package com.example.bookapplication.ui.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.bookapplication.R
import com.example.bookapplication.ui.IntentKeys
import com.example.bookapplication.util.addFragment

class BookDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)
        addFragment(supportFragmentManager, R.id.framelayout, BookDetailFragment().apply {
            arguments = getBundle()
        })
    }

    private fun getBundle(): Bundle = Bundle().apply {
        putSerializable(IntentKeys.selected_item_key, intent.getSerializableExtra(IntentKeys.selected_item_key))
    }
}