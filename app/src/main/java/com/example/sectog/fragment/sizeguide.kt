package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivitySearchResultBinding
import com.example.sectog.databinding.ActivitySizeguideBinding

class sizeguide : AppCompatActivity() {
    var binding: ActivitySizeguideBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySizeguideBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
