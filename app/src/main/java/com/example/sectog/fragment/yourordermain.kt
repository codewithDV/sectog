
package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityWishlistBinding
import com.example.sectog.databinding.ActivityYourordermainBinding

class yourordermain : AppCompatActivity() {
    var binding: ActivityYourordermainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYourordermainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
