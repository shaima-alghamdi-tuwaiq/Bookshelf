package com.example.bookshelf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.HorizontalScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.bookshelf.adapter.BookAdapter
import com.example.bookshelf.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val datset = Datasource().loadBooks()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_books)
        val adapter = BookAdapter(this, datset)
        recyclerView.adapter = adapter

        // change item arangment on the screen
        // Grid View
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}