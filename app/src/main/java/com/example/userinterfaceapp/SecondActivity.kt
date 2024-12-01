package com.example.userinterfaceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val bookList = listOf(
            Book("La maison du guet ", "May Higgins Clark"),
            Book("7 ans après", "Guillaume Muso"),
            Book("Vol de nuit", "Antoine de Saint-Exupéry")
        )
        bookAdapter = BookAdapter(bookList)
        recyclerView.adapter = bookAdapter
    }

}