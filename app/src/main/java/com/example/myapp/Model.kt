package com.example.myapp

import java.util.*

data class  Hobby(var title:String)

object Supplier{
    val hobbies = listOf<Hobby>(Hobby("swimming"),
                                Hobby("reading"),
                                Hobby("walking"),
                                Hobby("reading"),
        Hobby("playing"),
        Hobby("running"),
        Hobby("dancing"),
        Hobby("singing"),
        Hobby("eating")

    )
}