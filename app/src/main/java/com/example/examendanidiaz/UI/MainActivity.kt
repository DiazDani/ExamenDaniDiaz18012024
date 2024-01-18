package com.example.examendanidiaz.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.examendanidiaz.R
import com.example.examendanidiaz.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* binding= ActivityMainBinding.inflate(layoutInflater)



        val navHostFragment = supportFragmentManager.findFragmentById(R.id.bottomNavigationView) as NavHostFragment


        navController= navHostFragment.navController

        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)*/
    }
}