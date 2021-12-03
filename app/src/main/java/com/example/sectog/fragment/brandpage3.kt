package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityBrandpage1Binding
import com.example.sectog.databinding.ActivityBrandpage3Binding

class brandpage3 : AppCompatActivity() {
    var binding: ActivityBrandpage3Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandpage3Binding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
