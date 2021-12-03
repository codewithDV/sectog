package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivitySubCategoriesBinding
import com.example.sectog.databinding.ActivitySucessBinding

class sucess : AppCompatActivity() {
    var binding: ActivitySucessBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySucessBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
