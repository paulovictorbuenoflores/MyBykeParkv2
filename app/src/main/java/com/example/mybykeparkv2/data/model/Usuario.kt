package com.example.mybykeparkv2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuario")
data class Usuario(
    @PrimaryKey
    val id: Int,
    val nome: String,
    val email: String,
    val senha: String,
    val perfilImageURL: String
)