package com.example.sectog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.databinding.ActivitySigninBinding


class signin : AppCompatActivity() {
    var binding: ActivitySigninBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding?.root)
//        tvSignup2.setOnClickListener {
//            val intent = Intent(this,signin::class.java)
//            startActivity(intent)
//        }
    }
}