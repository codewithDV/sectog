package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityPaymentBinding
import com.example.sectog.databinding.ActivityReviwesBinding

class Reviwes : AppCompatActivity() {
    var binding: ActivityReviwesBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviwesBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
