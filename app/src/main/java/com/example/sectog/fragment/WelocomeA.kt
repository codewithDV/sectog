package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivitySucessBinding
import com.example.sectog.databinding.ActivityWelocomeBinding

class WelocomeA : AppCompatActivity() {
    var binding: ActivityWelocomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelocomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
