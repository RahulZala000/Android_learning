package com.example.data_binding

import androidx.lifecycle.ViewModel

class DataViewModel(i: Int) :ViewModel() {
    var counter:Int= i as Int

    fun Increment()
    {
        counter++
    }
}