package com.eman.testcoroutine.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eman.testcoroutine.data.api.ApiServices
import com.eman.testcoroutine.ui.MainViewModel

class ViewModelFactory(private val apiHelper: ApiServices) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(apiHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}