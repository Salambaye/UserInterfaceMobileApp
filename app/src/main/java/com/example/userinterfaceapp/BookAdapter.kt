package com.example.userinterfaceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {// Le BookAdapter est responsable de convertir la liste de livres (`bookList`) en éléments visuels qui seront affichés dans le RecyclerView. {
<<<<<<< HEAD
=======
    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.tvBookTitle)
        val authorTextView: TextView = itemView.findViewById(R.id.tvBookAuthor)
    }
>>>>>>> 9d08ec0a96c8b170ad66bb70800e898da7a2b0e1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
<<<<<<< HEAD
        holder.bind(book)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.tvBookTitle)
        private val authorTextView: TextView = itemView.findViewById(R.id.tvBookAuthor)

        init {
            // Appliquer le style à l'élément
            itemView.setBackgroundResource(R.drawable.item_background) // Définir l'arrière-plan
        }

        fun bind(book: Book) {
            titleTextView.text = book.title
            authorTextView.text = book.author
        }
    }
=======
        holder.titleTextView.text = book.title // Ce code lie les données de l'objet `Book` (titre) au `TextView` de chaque élément du RecyclerView.
        holder.authorTextView.text = book.author
    }

    override fun getItemCount() = bookList.size
>>>>>>> 9d08ec0a96c8b170ad66bb70800e898da7a2b0e1
}