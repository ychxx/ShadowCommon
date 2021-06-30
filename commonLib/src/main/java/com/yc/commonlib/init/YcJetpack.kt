package com.yc.commonlib.init

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.yc.commonlib.extension.YcLogExt

/**
 * Creator: yc
 * Date: 2021/6/3 13:54
 * UseDes:
 */
object YcJetpack {
    /**
     * 请求成功返回的code
     */
    var mNetSuccessCode: Int? = 200
    const val OTHER_BASE_URL = "other_base_url"
    var mDefaultBaseUrl = ""
    public lateinit var mApplication: Application

    @JvmStatic
    fun init(app: Application) {
        mApplication = app
        //Logger初始化
        Logger.addLogAdapter(AndroidLogAdapter())
    }

    @JvmStatic
    fun setBaseUrl(baseUrl: String = "") {
        mDefaultBaseUrl = baseUrl
    }

    /**
     * 是否显示logger
     */
    @JvmStatic
    fun setLog(isShow: Boolean) {
        YcLogExt.mIsShowLogger = isShow
    }
}