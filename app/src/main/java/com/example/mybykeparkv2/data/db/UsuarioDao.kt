package com.example.mybykeparkv2.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mybykeparkv2.data.model.Usuario


@Dao
interface UsuarioDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUsuario(usuario : Usuario)

    @Query("SELECT * FROM usuario")
    suspend fun getUsuario():List<Usuario>

    suspend fun editUser()

    suspend fun deleteUser()
}