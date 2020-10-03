package com.eman.testcoroutine.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eman.testcoroutine.data.api.ApiServices
import com.eman.testcoroutine.data.model.ApiUser
import com.eman.testcoroutine.utils.MainResult
import com.eman.testcoroutine.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel(var api: ApiServices) : ViewModel() {
    private val users = MutableLiveData<Resource<List<ApiUser>>>()

    init {
        fetchUser()
    }

    fun fetchUser() {
        viewModelScope.launch {
            try {
                val result = api.getUsers()
                users.postValue(Resource.success(result))
            } catch (e: Exception) {
                users.postValue(Resource.error(e.message!!,null))
            }
        }
    }

    fun getUser():MutableLiveData<Resource<List<ApiUser>>>{
        return users
    }
}