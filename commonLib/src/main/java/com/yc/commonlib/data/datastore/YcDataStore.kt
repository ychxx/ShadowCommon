//package com.yc.commonlib.data.datastore
//
//import android.content.Context
//import androidx.datastore.core.DataStore
//import androidx.datastore.preferences.core.Preferences
//import androidx.datastore.preferences.core.edit
//import androidx.datastore.preferences.createDataStore
//import kotlinx.coroutines.flow.first
//import kotlinx.coroutines.flow.map
//import java.util.prefs.Preferences
//
///**
// *  PreferencesDataStore    先用
// *  ProtoDataStore          以后在换
// */
//class YcDataStore private constructor() {
//    lateinit var mDataStorePre: DataStore<Preferences>
//    fun init(context: Context) {
//        mDataStorePre = context.createDataStore("YcDataStore")
//    }
//
//    companion object {
//        val instance: YcDataStore by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { YcDataStore()}
//
//        suspend inline fun <reified T : Any> save(key: Preferences.Key<T>, value: T) {
//            when (T::class) {
//                String::class -> instance.mDataStorePre.edit {
//                    it[key] = value
//                }
//                Double::class -> instance.mDataStorePre.edit {
//                    it[key] = value
//                }
//                Int::class -> instance.mDataStorePre.edit {
//                    it[key] = value
//                }
//                Boolean::class -> instance.mDataStorePre.edit {
//                    it[key] = value
//                }
//                else -> throw IllegalArgumentException("Type not supported: ${T::class.java}")
//            }
//        }
//        suspend inline fun <reified T : Any> get(key: Preferences.Key<T>) =
//            when (T::class) {
//                String::class -> {
//                    instance.mDataStorePre.data.map {
//                        it[key] ?: ""
//                    }.first() as T
//                }
//                Double::class -> {
//                    instance.mDataStorePre.data.map {
//                        it[key] ?: -1f
//                    }.first() as T
//                }
//                Int::class -> {
//                    instance.mDataStorePre.data.map {
//                        it[key] ?: -1
//                    }.first() as T
//                }
//                Boolean::class -> {
//                    instance.mDataStorePre.data.map {
//                        it[key] ?: false
//                    }.first() as T
//                }
//                else -> throw IllegalArgumentException("Type not supported: ${T::class.java}")
//            }
//    }
//}
//
