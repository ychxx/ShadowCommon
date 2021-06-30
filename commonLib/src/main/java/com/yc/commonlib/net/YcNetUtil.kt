package com.yc.commonlib.net

import android.content.Context
import android.net.ConnectivityManager
import com.yc.commonlib.init.YcJetpack

/**
 *
 */
object YcNetUtil {
    fun isNetworkAvailable(): Boolean {
        val manager = YcJetpack.mApplication.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info = manager.activeNetworkInfo
        return null != info && info.isAvailable
    }
}