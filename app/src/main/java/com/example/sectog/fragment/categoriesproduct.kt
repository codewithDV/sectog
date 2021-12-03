package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.databinding.ActivityCategories2Binding
import com.example.sectog.databinding.ActivityCategoriesproductBinding

class categoriesproduct : AppCompatActivity() {
    var binding: ActivityCategoriesproductBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesproductBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
