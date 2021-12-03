package com.example.sectog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectog.databinding.ActivityCollectionBinding
import com.example.sectog.databinding.ActivityStartwithphoneBinding

class startwithphone : AppCompatActivity() {
    var binding: ActivityStartwithphoneBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartwithphoneBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}
