package com.example.mybykeparkv2.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mybykeparkv2.data.model.Amigo

@Dao
interface AmigoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAmigo(amigo : Amigo)

    @Query("SELECT * FROM amigo")
    suspend fun getAmigo():List<Amigo>

    suspend fun editAmigo()

    suspend fun deleteAmigo()
}