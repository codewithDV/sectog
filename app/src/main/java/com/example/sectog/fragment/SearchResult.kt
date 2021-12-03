package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityReviwesBinding
import com.example.sectog.databinding.ActivitySearchResultBinding

class SearchResult : AppCompatActivity() {
    var binding: ActivitySearchResultBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
