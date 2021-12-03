package com.example.sectog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.databinding.ActivityStartwithphoneBinding
import com.example.sectog.databinding.ActivityVerificationBinding


class Verification : AppCompatActivity() {
    var binding: ActivityVerificationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
