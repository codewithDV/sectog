package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityBrandpage1Binding
import com.example.sectog.databinding.ActivityDeliveryBinding
import com.example.sectog.databinding.ActivityFilter2Binding

class Filter2 : AppCompatActivity() {
    var binding: ActivityFilter2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilter2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
