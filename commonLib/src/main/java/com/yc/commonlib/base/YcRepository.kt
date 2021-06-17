package com.yc.commonlib.base

import com.yc.commonlib.extension.checkNet
import com.yc.commonlib.net.YcResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Creator: yc
 * Date: 2021/6/15 18:27
 * UseDes:
 */
open class YcRepository {
    inline fun <reified T : YcResult<D>, D> ycFlow(crossinline block: suspend () -> T): Flow<YcResult<D>> = flow {
        emit(block.invoke())
    }.checkNet()
}