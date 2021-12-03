package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.databinding.ActivityBrandpage1Binding
import com.example.sectog.databinding.ActivityBrandpage2Binding

class brandpage2 : AppCompatActivity() {
    var binding: ActivityBrandpage2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandpage2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
