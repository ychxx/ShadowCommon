package com.yc.commonlib.data.constant
/**
 *
 */
object YcNetErrorCode {
    /**
     * 未知错误
     */
    const val UN_KNOWN_ERROR = 1000

    /**
     * 网络错误
     */
    const val NETWORK_ERROR = 1002

    /**
     * 网络超时
     */
    const val TIME_OUT_ERROR = 1003

    /**
     * 解析错误
     */
    const val JSON_ERROR = 1004

    /**
     * 数据为空
     */
    const val DATE_NULL = 1005

    /**
     * 数据为空错误，用于请求的数据不能为空接口判断
     */
    const val DATE_NULL_ERROR = 1007

    /**
     * 加载更多时数据为空
     */
    const val MORE_DATE_NULL = 1008


    /**
     * 请求错误
     */
    const val REQUEST_NULL = 1006
}