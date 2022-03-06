package com.example.data_binding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DataFactory(var count: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DataViewModel(count) as T
    }
}