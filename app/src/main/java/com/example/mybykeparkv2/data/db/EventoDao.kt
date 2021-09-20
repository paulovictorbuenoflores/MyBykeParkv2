package com.example.mybykeparkv2.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mybykeparkv2.data.model.Evento

@Dao
interface EventoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveEvento(evento : Evento)

    @Query("SELECT * FROM evento")
    suspend fun getEvento():List<Evento>

    suspend fun editEvento()

    suspend fun deleteEvento()
}