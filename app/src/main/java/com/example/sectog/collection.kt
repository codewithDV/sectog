package com.example.sectog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.databinding.ActivityCollectionBinding


class collection : AppCompatActivity() {
    var binding: ActivityCollectionBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCollectionBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }

}
