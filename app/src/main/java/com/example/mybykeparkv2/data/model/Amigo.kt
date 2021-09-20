package com.example.mybykeparkv2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "amigo")
data class Amigo(
    @PrimaryKey
    val id: Int,
    val nome: String
)