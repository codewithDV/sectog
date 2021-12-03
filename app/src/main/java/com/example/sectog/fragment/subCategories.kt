package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivitySizeguideBinding
import com.example.sectog.databinding.ActivitySubCategoriesBinding

class subCategories : AppCompatActivity() {
    var binding: ActivitySubCategoriesBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubCategoriesBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
