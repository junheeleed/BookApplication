package com.example.bookapplication.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.bookapplication.R

fun ImageView.fromUrl(url: String?) {
    Glide.with(context)
        .load(url)
        .override(1000, 400)
        .placeholder(R.mipmap.ic_launcher)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .into(this)
}