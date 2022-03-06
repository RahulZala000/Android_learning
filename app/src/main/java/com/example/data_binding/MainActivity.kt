package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var viewmodel:DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewmodel=ViewModelProvider(this,DataFactory(10)).get(DataViewModel::class.java)
        binding.data.text=viewmodel.counter.toString()
        binding.add.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        viewmodel.Increment()
        binding.data.text=viewmodel.counter.toString()
    }
}
