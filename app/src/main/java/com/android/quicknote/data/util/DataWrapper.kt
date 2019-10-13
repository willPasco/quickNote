package com.android.quicknote.data.util

class DataWrapper<T> {

    var data: T? = null
    var message: String? = null
    var code: Int? = null


    override fun toString(): String {
        return "DataWrapper(data=$data, message=$message, code=$code)"
    }
}
