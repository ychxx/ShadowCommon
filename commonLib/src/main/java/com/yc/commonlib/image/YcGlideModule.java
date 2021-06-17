package com.yc.commonlib.image;

import android.content.Context;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import androidx.annotation.NonNull;

/**
 * Creator: yc
 * Date: 2021/6/4 17:41
 * UseDes:
 */

@GlideModule
public class YcGlideModule extends AppGlideModule {

    //禁止解析Manifest文件,可以提升初始化速度，避免一些潜在错误
    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
//        builder.setDefaultRequestOptions(YcImageLoad.getDefaultRequestOptions());
    }
}
