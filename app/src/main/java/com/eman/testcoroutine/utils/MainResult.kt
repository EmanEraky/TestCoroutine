package com.eman.testcoroutine.utils

import com.eman.testcoroutine.data.model.ApiUser

sealed class MainResult {
    data class SucessLoadData(val list: List<ApiUser>) : MainResult()
    data class ErrorData(val e: Exception) : MainResult()
    object LoadData : MainResult()


}