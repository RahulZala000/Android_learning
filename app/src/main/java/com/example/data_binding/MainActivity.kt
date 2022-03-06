package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModelProvider
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LifecycleObserver {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycle.addObserver(Observer())
        Log.d("@create","create")

    }

    override fun onPause() {
        super.onPause()
        Log.d("@pause","pause")
    }


    override fun onResume() {
        super.onResume()
        Log.d("@resume","resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("@stop","stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("@destroy","destroy")
    }

}
