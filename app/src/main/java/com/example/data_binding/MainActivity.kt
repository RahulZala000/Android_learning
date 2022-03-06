package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.data_binding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel:DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel=ViewModelProvider(this).get(DataViewModel::class.java)
        var user=User("Rahul")
        binding.user=user
        viewModel.str.observe(this, Observer {
            binding.data.text=it
        })

        binding.add.setOnClickListener {
            viewModel.update()
        }



    }

}
