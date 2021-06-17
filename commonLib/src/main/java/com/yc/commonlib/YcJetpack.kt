package com.yc.commonlib

import android.app.Application
import android.os.Process
import android.util.Log
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.yc.commonlib.extension.YcLogExt
import com.yc.commonlib.net.YcRetrofitUtil
import retrofit2.Retrofit

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
    fun init(app: Application, baseUrl: String = "") {
        mApplication = app
        mDefaultBaseUrl = baseUrl
        //Logger初始化
        Logger.addLogAdapter(AndroidLogAdapter())
    }

    /**
     * 是否显示logger
     */
    @JvmStatic
    fun setLog(isShow: Boolean) {
        YcLogExt.mIsShowLogger = isShow
    }
}