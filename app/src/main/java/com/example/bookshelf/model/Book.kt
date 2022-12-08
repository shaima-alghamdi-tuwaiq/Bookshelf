package com.example.bookshelf.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Book(
        @DrawableRes val bookImage : Int,
        @StringRes val bookTitle : Int
    )
