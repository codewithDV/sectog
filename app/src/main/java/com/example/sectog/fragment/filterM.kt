
package com.example.sectog.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.R
import com.example.sectog.databinding.ActivityFilter2Binding
import com.example.sectog.databinding.ActivityFilterMBinding

class filterM : AppCompatActivity() {
    var binding: ActivityFilterMBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilterMBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
