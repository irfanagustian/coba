package com.example.coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bottomNavigationView.setOnNavigationItemSelectedListener(onBottomNavigationListener)
        var fragment = supportFragmentManager.beginTransaction()
        fragment.add(R.id.fl, HomeFragment())
        fragment.commit()

    }

    private val onBottomNavigationListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        var selectedFragment : Fragment = HomeFragment()

        when(item.itemId) {
            R.id.id_home -> {
                selectedFragment = HomeFragment()
            }
            R.id.id_profil -> {
                selectedFragment =ProfilFragment()
            }
        }

        var fragment = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fl, selectedFragment)
        fragment.commit()
        true

    }

}