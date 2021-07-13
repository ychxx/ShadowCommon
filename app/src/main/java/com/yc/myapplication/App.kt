package com.yc.myapplication

import android.app.Application
import com.yc.commonlib.init.YcCommon

/**
 * Creator: yc
 * Date: 2021/7/13 16:31
 * UseDes:
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        YcCommon.Instance.init(this)
        YcCommon.Instance.apply {
            init(this@App)
            mImgIdResFail = R.drawable.test_img
        }
    }
}