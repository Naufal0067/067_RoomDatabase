package com.example.a067_roomdatabase.room

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDao {
    @Query("SELECT * from tblsiswa ORDER BY nama ASC")
    fun  getAllSiswa(): Flow<List<Siswa>>
}