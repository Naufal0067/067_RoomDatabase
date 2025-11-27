package com.example.a067_roomdatabase.repositori

import com.example.a067_roomdatabase.room.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSIswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}