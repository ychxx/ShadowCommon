package com.yc.commonlib.base

import com.yc.commonlib.extension.checkNet
import com.yc.commonlib.net.YcResult
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow

/**
 * Creator: yc
 * Date: 2021/6/15 18:27
 * UseDes:
 */
open class YcRepository {
    public fun <T> ycFlow(block: suspend ProducerScope<YcResult<T>>.() -> Unit): Flow<YcResult<T>> = channelFlow {
        block()
    }.checkNet()
}