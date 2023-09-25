package com.example.imageloader

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

object ImageLoader {
    fun load(context: Context, imageUri: Uri, imageView: ImageView){
        Glide.with(context)
            .load(imageUri)
            .error(R.drawable.placeholder)
            .placeholder(R.drawable.placeholder)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(imageView)

    }
}