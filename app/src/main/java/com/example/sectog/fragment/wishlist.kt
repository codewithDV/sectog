package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityWelocomeBinding
import com.example.sectog.databinding.ActivityWishlistBinding

class wishlist : AppCompatActivity() {
    var binding: ActivityWishlistBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWishlistBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
