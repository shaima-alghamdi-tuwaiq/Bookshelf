package com.example.bookshelf.data

import com.example.bookshelf.R
import com.example.bookshelf.model.Book

class Datasource {

    // return list of data
    fun loadBooks() : List<Book> {
        return listOf(
            Book(R.drawable.image1, R.string.book1),
            Book(R.drawable.image2, R.string.book2),
            Book(R.drawable.image3, R.string.book3),
            Book(R.drawable.image4, R.string.book4),
            Book(R.drawable.image5, R.string.book5),
            Book(R.drawable.image6, R.string.book6),
            Book(R.drawable.image7, R.string.book7)
        ) // end of return
    }
}
