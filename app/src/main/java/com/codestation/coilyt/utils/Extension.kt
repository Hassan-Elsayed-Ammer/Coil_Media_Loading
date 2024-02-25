package com.codestation.coilyt.utils

import android.widget.ImageView
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.codestation.coilyt.R

fun ImageView.loadImageUrl(url: String?) {
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(SvgDecoder.Factory())
            add(GifDecoder.Factory())
        }
        .build()

    val request = ImageRequest.Builder(context)
        .crossfade(true)
        .crossfade(400)
        .placeholder(R.drawable.ic_image_placeholder)
        .error(R.drawable.ic_error)
        .data(url)
        .target(this)
        .build()

    imageLoader.enqueue(request)
}
