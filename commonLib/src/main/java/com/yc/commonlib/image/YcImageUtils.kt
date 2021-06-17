package com.yc.commonlib.image

import android.content.Context
import android.widget.ImageView
import androidx.annotation.DrawableRes

/**
 * Creator: yc
 * Date: 2021/6/4 17:44
 * UseDes:
 */
object YcImageUtils {

    fun load(context: Context, @DrawableRes imgResId: Int, imageView: ImageView) {
        GlideApp.with(context)
            .asBitmap()
            .load(imgResId)
            .into(imageView)
    }

    fun loadNet(context: Context, imgNetUrl: String, imageView: ImageView) {
        GlideApp.with(context)
            .asBitmap()
            .load(imgNetUrl)
            .into(imageView)
    }
}