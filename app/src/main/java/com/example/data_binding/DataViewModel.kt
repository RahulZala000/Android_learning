package com.example.data_binding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel() :ViewModel() {

    var str=MutableLiveData<String>("this first")

    var live:LiveData<String> = str


    fun update()
    {
        str.value="second"
    }
}