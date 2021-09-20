package com.example.mybykeparkv2.data.db;

import androidx.room.Database;

@Database(
    entities = [AmigoDao::class, EventoDao::class, ParqueDao::class, UsuarioDao::class],
    version = 1,
    exportSchema = false
)
abstract class MyBikeParkDatabase {
    abstract fun amigoDao() : AmigoDao
    abstract fun eventoDao() : EventoDao
    abstract fun parqueDao() : ParqueDao
    abstract fun usuarioDao() : UsuarioDao
}
