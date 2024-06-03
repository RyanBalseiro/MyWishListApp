package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch", description = "Android smart watch"),
        Wish(title = "Galaxy S29", description = "Android smart phone"),
        Wish(title = "Ferrari ", description = "Sports car"),
        Wish(title = "$1,000,000,000", description = "a billion dollars")
    )
}