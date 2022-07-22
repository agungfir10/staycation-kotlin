package com.agungfir.staycation.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.agungfir.staycation.R
import com.agungfir.staycation.databinding.ActivityMainBinding
import com.agungfir.staycation.ui.main.favorite.FavoriteFragment
import com.agungfir.staycation.ui.main.home.HomeFragment
import com.agungfir.staycation.ui.main.profile.ProfileFragment
import com.agungfir.staycation.ui.main.transaction.TransactionFragment

class MainActivity : AppCompatActivity() {

    private val fm: FragmentManager = supportFragmentManager
    private lateinit var binding: ActivityMainBinding
    private val homeFragment: HomeFragment = HomeFragment()
    private val favoriteFragment: FavoriteFragment = FavoriteFragment()
    private val transactionFragment: TransactionFragment = TransactionFragment()
    private val profileFragment: ProfileFragment = ProfileFragment()
    private var active: Fragment = homeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navView.apply {
            setOnItemSelectedListener {
                binding.navView.onItemSelected(it.itemId)
                when (it.itemId) {
                    R.id.nav_home -> {
                        fm.beginTransaction().hide(active).show(homeFragment).commit()
                        active = homeFragment
                    }
                    R.id.nav_favorite -> {
                        fm.beginTransaction().hide(active).show(favoriteFragment).commit()
                        active = favoriteFragment
                    }
                    R.id.nav_transaction -> {
                        fm.beginTransaction().hide(active).show(transactionFragment).commit()
                        active = transactionFragment
                    }
                    R.id.nav_profile -> {
                        fm.beginTransaction().hide(active).show(profileFragment).commit()
                        active = profileFragment
                    }
                }
                true
            }
        }


        fm.beginTransaction().add(
            R.id.nav_host_fragment_activity_main,
            homeFragment,
            HomeFragment::class.java.simpleName
        ).commit()
        fm.beginTransaction().add(
            R.id.nav_host_fragment_activity_main,
            favoriteFragment,
            FavoriteFragment::class.java.simpleName
        ).hide(favoriteFragment).commit()

        fm.beginTransaction().add(
            R.id.nav_host_fragment_activity_main,
            transactionFragment,
            TransactionFragment::class.java.simpleName
        ).hide(transactionFragment).commit()

        fm.beginTransaction().add(
            R.id.nav_host_fragment_activity_main,
            profileFragment,
            ProfileFragment::class.java.simpleName
        ).hide(profileFragment).commit()

    }

}