package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityMainActivityselectionBinding
import com.example.sectog.databinding.ActivityMybagcartBinding

class mybagcart : AppCompatActivity() {
    var binding: ActivityMybagcartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMybagcartBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
