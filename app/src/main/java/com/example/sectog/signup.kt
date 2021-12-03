package com.example.sectog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sectog.databinding.ActivitySignupBinding


class signup : AppCompatActivity() {
    var binding: ActivitySignupBinding? = null  // binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        val signinbutton = findViewById<Button>(R.id.btSignin)

        signinbutton.setOnClickListener {
            val intent = Intent(this, collection::class.java)
            startActivity(intent)
        }
    }
}