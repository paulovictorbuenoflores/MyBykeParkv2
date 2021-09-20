package com.example.mybykeparkv2.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mybykeparkv2.data.model.Parque

@Dao
interface ParqueDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveParque(parque : Parque)

    @Query("SELECT * FROM parque")
    suspend fun getParque():List<Parque>

    suspend fun editParque()

    suspend fun deleteParque()
}