package com.codext.project.pokemonappstarter.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.codext.project.pokemonappstarter.R
import com.codext.project.pokemonappstarter.databinding.ActivityHomeBinding
import com.codext.project.pokemonappstarter.favorite.FavoriteActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.favButton -> goToFavoriteActivity()
        }
        return true
    }

    private fun goToFavoriteActivity() {
        val intent = Intent(this, FavoriteActivity::class.java)
        startActivity(intent)
    }
}