package com.example.userinterfaceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.userinterfaceapp.ui.theme.UserInterfaceAppTheme
import com.google.android.material.navigation.NavigationView

class MainActivity : ComponentActivity() {

    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // Pour passer à l'activité suivante
        val btnNextActivity: Button = findViewById(R.id.btnNextActivity)
        btnNextActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


        // Bouton pour ouvrir le menu
        val btnOpenDrawer: Button = findViewById(R.id.btnOpenDrawer)
        btnOpenDrawer.setOnClickListener {
            drawerLayout.openDrawer(navView) // Ouvre le menu latéral
        }

        // Gestion de la navigation dans le menu
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_main -> {
                    Toast.makeText(this, "Vous êtes déjà sur la page principale", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_second -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_easter_egg -> {
                    Toast.makeText(this, "Félicitations pour l'Easter Egg !", Toast.LENGTH_LONG).show()
                }
            }
            drawerLayout.closeDrawers()
            true
        }


    }


}