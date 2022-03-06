package com.example.data_binding

import androidx.lifecycle.ViewModel

class DataViewModel:ViewModel() {
    var counter:Int=0

    fun Increment()
    {
        counter++
    }
}