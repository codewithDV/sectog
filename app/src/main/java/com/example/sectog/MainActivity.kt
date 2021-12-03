package com.example.sectog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.NavigationUI
import com.example.sectog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // lateinit var navController:NavController
    var bottomNavigationView: BottomNavigationView? = null
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        // finding bottom navi
        bottomNavigationView = findViewById(R.id.BottomNav)

        // nav host fragment set

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFrame) as NavHostFragment?
        NavigationUI.setupWithNavController(bottomNavigationView!!, navHostFragment!!.navController)

    }
}