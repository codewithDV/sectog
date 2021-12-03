package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityMybagcartBinding
import com.example.sectog.databinding.ActivityPaymentBinding

class payment : AppCompatActivity() {
    var binding: ActivityPaymentBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
