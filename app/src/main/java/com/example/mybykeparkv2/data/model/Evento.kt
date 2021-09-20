package com.example.mybykeparkv2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "evento")
data class Evento(
    @PrimaryKey
    val id: Int,
    val nome: String
)