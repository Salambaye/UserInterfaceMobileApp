package com.example.userinterfaceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val bookList = listOf(
            Book("La maison du guet ", "May Higgins Clark"),
            Book("7 ans après", "Guillaume Muso"),
            Book("Vol de nuit", "Antoine de Saint-Exupéry")
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(bookList)
    }

}