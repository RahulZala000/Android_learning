package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModelProvider
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var viewmodel:DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewmodel=ViewModelProvider(this).get(DataViewModel::class.java)
        binding.data.text=viewmodel.counter.toString()
        binding.add.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        viewmodel.Increment()
        binding.data.text=viewmodel.counter.toString()
    }
}
