package com.yc.commonlib.net

import android.content.Context
import android.net.ConnectivityManager
import com.yc.commonlib.init.YcCommon

/**
 *
 */
object YcNetUtil {
    fun isNetworkAvailable(): Boolean {
        val manager = YcCommon.Instance.mApplication.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info = manager.activeNetworkInfo
        return null != info && info.isAvailable
    }
}