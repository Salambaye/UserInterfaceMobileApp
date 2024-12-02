package com.example.userinterfaceapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import android.widget.Button
=======
>>>>>>> 9d08ec0a96c8b170ad66bb70800e898da7a2b0e1
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter
<<<<<<< HEAD

    @SuppressLint("MissingInflatedId")
=======
>>>>>>> 9d08ec0a96c8b170ad66bb70800e898da7a2b0e1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

<<<<<<< HEAD
        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Cela permet de revenir à l'activité précédente
        }

=======
>>>>>>> 9d08ec0a96c8b170ad66bb70800e898da7a2b0e1
        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val bookList = listOf(
<<<<<<< HEAD
            Book("La maison du guet ", "Mary Higgins Clark"),
=======
            Book("La maison du guet ", "May Higgins Clark"),
>>>>>>> 9d08ec0a96c8b170ad66bb70800e898da7a2b0e1
            Book("7 ans après", "Guillaume Muso"),
            Book("Vol de nuit", "Antoine de Saint-Exupéry")
        )
        bookAdapter = BookAdapter(bookList)
        recyclerView.adapter = bookAdapter
    }

}