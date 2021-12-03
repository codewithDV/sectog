package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityYourordermainBinding
import com.example.sectog.databinding.ActivityYourordersBinding

class yourorders : AppCompatActivity() {
    var binding: ActivityYourordersBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYourordersBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
