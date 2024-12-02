package com.example.userinterfaceapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Cela permet de revenir à l'activité précédente
        }

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val bookList = listOf(
            Book("La maison du guet ", "Mary Higgins Clark"),
            Book("7 ans après", "Guillaume Muso"),
            Book("Vol de nuit", "Antoine de Saint-Exupéry")
        )
        bookAdapter = BookAdapter(bookList)
        recyclerView.adapter = bookAdapter
    }

}