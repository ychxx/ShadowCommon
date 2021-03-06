package com.yc.commonlib.extension

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.signature.ObjectKey
import com.yc.commonlib.R
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

/**
 * 加载网络图片
 */
fun ImageView.ycLoadImageNet(imageNet: String) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imageNet)
        .into(this)
}

fun ImageView.ycLoadImageNetCircle(imageNet: String) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imageNet)
        .circleCrop()
        .into(this)
}

/**
 * 加载网络图片（用时间来区分地址相同，图片内容不相同情况）
 */
fun ImageView.ycLoadImageNet(imgNetUrl: String, imageUpdateTime: String) {
    GlideApp.with(this.context)
        .applyDefaultRequestOptions(RequestOptions().signature(ObjectKey(imageUpdateTime)))
        .asBitmap()
        .load(imgNetUrl)
        .into(this)
}

/**
 * 加载网络图片
 */
fun ImageView.ycLoadImageNetCircle(imgNetUrl: String, imageUpdateTime: String) {
    GlideApp.with(this.context)
        .applyDefaultRequestOptions(RequestOptions().signature(ObjectKey(imageUpdateTime)))
        .asBitmap()
        .load(imgNetUrl)
        .circleCrop()
        .into(this)
}

fun ImageView.ycLoadImageFile(imageFile: File) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imageFile)
        .into(this)
}

fun ImageView.ycLoadImageFileCircle(imageFile: File) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imageFile)
        .circleCrop()
        .into(this)
}

fun ImageView.ycLoadImageRes(@DrawableRes imgRes: Int) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imgRes)
        .into(this)
}

fun ImageView.ycLoadImageResCircle(@DrawableRes imgRes: Int) {
    GlideApp.with(this.context)
        .asBitmap()
        .load(imgRes)
        .circleCrop()
        .into(this)
}