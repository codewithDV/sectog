package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityBrandpage1Binding
import com.example.sectog.databinding.ActivityBrandpage3Binding
import com.example.sectog.databinding.ActivityConfirmationBinding

class confirmation : AppCompatActivity() {
    var binding: ActivityConfirmationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmationBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
