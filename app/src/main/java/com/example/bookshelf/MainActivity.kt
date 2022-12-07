package com.example.bookshelf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookshelf.adapter.BookAdapter
import com.example.bookshelf.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datset = Datasource().loadBooks()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_books)

        val adapter = BookAdapter(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)

    }
}