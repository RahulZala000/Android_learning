package com.example.data_binding

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer:LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create()
    {
        Log.d("@create","Oncreate ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause()
    {
        Log.d("@pause","Onpause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
     fun onResume()
     {
        Log.d("@resume","onresume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop()
    {
        Log.d("@stop","Onstop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy()
    {
        Log.d("@destroy","Ondestroy")
    }

}