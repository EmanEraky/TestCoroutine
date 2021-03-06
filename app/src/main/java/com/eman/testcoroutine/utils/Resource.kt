package com.eman.testcoroutine.utils

data class Resource<out T>(val status : Status ,val data: T?,val message :String?) {

    companion object {

        fun <T> success(data: T?): Resource<T> {
            return Resource(status = Status.SUCCESS,data,null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            return Resource(status = Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(status = Status.LOADING, data, null)
        }

    }

}