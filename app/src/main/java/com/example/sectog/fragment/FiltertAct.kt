package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityFilterMBinding
import com.example.sectog.databinding.ActivityFiltertBinding

class FiltertAct : AppCompatActivity() {
    var binding: ActivityFiltertBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiltertBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
