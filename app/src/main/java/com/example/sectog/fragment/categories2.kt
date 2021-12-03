package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityCartitemBinding
import com.example.sectog.databinding.ActivityCategories2Binding

class categories2 : AppCompatActivity() {
    var binding: ActivityCategories2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategories2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
