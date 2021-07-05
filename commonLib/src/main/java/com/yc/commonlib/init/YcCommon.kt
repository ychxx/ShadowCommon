package com.yc.commonlib.init

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.yc.commonlib.extension.YcLogExt
import com.yc.commonlib.net.YcInterceptor
import okhttp3.Interceptor

/**
 * Creator: yc
 * Date: 2021/6/3 13:54
 * UseDes:
 */

class YcCommon private constructor() {
    companion object {
        const val OTHER_BASE_URL = "other_base_url"
        val Instance = YcJetpack2Holder.holder
    }

    private object YcJetpack2Holder {
        val holder = YcCommon()
    }

    /**
     * 请求成功返回的code
     */
    var mNetSuccessCode: Int? = 200

    /**
     * retrofit的过滤器
     */
    val mInterceptor: MutableList<Interceptor> = mutableListOf()
    var mDefaultBaseUrl = ""
    lateinit var mApplication: Application

    fun init(app: Application) {
        mApplication = app
        //Logger初始化
        Logger.addLogAdapter(AndroidLogAdapter())
    }


    fun setBaseUrl(baseUrl: String = "") {
        mDefaultBaseUrl = baseUrl
    }

    /**
     * 添加过滤器
     */
    fun addInterceptor(interceptor: Interceptor) {
        mInterceptor.add(interceptor)
    }

    /**
     * 是否显示logger
     */
    fun setLog(isShow: Boolean) {
        YcLogExt.mIsShowLogger = isShow
    }
}