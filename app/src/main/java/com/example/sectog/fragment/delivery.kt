package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityCategoriesproductBinding
import com.example.sectog.databinding.ActivityConfirmationBinding
import com.example.sectog.databinding.ActivityDeliveryBinding

class delivery : AppCompatActivity() {

        var binding: ActivityDeliveryBinding? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityDeliveryBinding.inflate(layoutInflater)
            setContentView(binding?.root)
        }
    }

