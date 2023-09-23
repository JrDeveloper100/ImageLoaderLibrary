package com.example.imageloader

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object ImageLoader {
    fun load(context: Context, imageUrl: String, imageView: ImageView){
        Glide.with(context)
            .load(imageUrl)
            .into(imageView)

    }
}