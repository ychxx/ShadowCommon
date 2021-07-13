package com.yc.commonlib.image

import android.content.Context
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.Priority
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.request.RequestOptions
import com.yc.commonlib.R
import com.yc.commonlib.init.YcCommon

/**
 * Creator: yc
 * Date: 2021/6/4 17:41
 * UseDes:
 */
@GlideModule
class YcGlideModule : AppGlideModule() {
    //禁止解析Manifest文件,可以提升初始化速度，避免一些潜在错误
    override fun isManifestParsingEnabled(): Boolean {
        return false
    }

    override fun applyOptions(context: Context, builder: GlideBuilder) {
        val options: RequestOptions = RequestOptions()
            .placeholder(YcCommon.Instance.mImgIdResLoading)
            .error(YcCommon.Instance.mImgIdResFail)
        builder.setDefaultRequestOptions(options)
    }
}