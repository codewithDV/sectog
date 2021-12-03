package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityBrandpage1Binding
import com.example.sectog.databinding.ActivitySigninBinding
import com.example.sectog.databinding.ActivityStartwithphoneBinding
import com.example.sectog.databinding.ActivityVerificationBinding

class brandpage1 : AppCompatActivity() {
    var binding: ActivityBrandpage1Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandpage1Binding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
