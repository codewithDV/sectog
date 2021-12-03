package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityBrandpage1Binding
import com.example.sectog.databinding.ActivityCartitemBinding

class cartitem : AppCompatActivity() {
    var binding: ActivityCartitemBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartitemBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
