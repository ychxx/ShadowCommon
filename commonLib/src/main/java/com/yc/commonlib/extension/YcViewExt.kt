package com.yc.commonlib.extension

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yc.commonlib.image.GlideApp
import java.io.File

/**
 * Creator: yc
 * Date: 2021/2/2 21:03
 * UseDes:
 */

fun RecyclerView.ycInitLinearLayoutManage(orientation: Int = RecyclerView.VERTICAL) {
    this.layoutManager = LinearLayoutManager(this.context, orientation, false)
}

fun TextView.ycSetTextColorRes(@ColorRes textColorRes: Int) {
    this.setTextColor(this.context.resources.getColor(textColorRes))
}

fun Button.ycSetTextColorRes(@ColorRes textColorRes: Int) {
    this.setTextColor(this.context.resources.getColor(textColorRes))
}

fun ImageView.ycLoadImageNet(imageNet: String) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imageNet)
        .into(this)
}

fun ImageView.ycLoadImageFile(imageFile: File) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imageFile)
        .into(this)
}

fun ImageView.ycLoadImageRes(@DrawableRes imgRes: Int) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imgRes)
        .into(this)
}
