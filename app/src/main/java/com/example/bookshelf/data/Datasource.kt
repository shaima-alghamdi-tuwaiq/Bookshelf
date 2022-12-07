package com.example.bookshelf.data

import com.example.bookshelf.R
import com.example.bookshelf.model.Book

class Datasource {

    // return list of data
    fun loadBooks() : List<Book> {
        return listOf(
            Book(R.string.book1),
            Book(R.string.book2),
            Book(R.string.book3),
            Book(R.string.book4),
            Book(R.string.book5),
            Book(R.string.book6),
            Book(R.string.book7)

        ) // end of return
    }
}
