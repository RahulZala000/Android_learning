package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var viewmodel:DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel=ViewModelProvider(this,).get(DataViewModel::class.java)

        viewmodel.str.observe(this, Observer {
            binding.data.text=it
        })
        binding.add.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
            viewmodel.update()
    }
}
