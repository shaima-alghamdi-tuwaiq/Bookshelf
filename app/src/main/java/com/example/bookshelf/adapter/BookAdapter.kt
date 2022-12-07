package com.example.bookshelf.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookshelf.R
import com.example.bookshelf.model.Book

// TODO [1] Implement Adapter Class
class BookAdapter(private val context: Context,
                  private val dataset : List<Book>)
    : RecyclerView.Adapter<BookAdapter.ViewHolder>() { // End of BookAdapter

    // TODO [3] Implement Adapter override methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.bookTitle.text = context.resources.getString(item.bookTitle)
    }

    override fun getItemCount() = dataset.size

    // TODO [2] Implement ViewHolder Class
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        // views in layout file
        val bookTitle : TextView = view.findViewById(R.id.item_book_title)

    } // End ViewHolder

} // End BookAdapter