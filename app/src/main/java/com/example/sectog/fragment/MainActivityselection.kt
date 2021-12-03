package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityFiltertBinding
import com.example.sectog.databinding.ActivityMainActivityselectionBinding

class MainActivityselection : AppCompatActivity() {
    var binding: ActivityMainActivityselectionBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainActivityselectionBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
