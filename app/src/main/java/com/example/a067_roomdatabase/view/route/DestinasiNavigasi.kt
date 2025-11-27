package com.example.a067_roomdatabase.view.route

interface DestinasiNavigasi {
    /** Nama unik untuk menentukan jalur unutk composable*/

    val route: String

    /** string resource id yang berisi judul yang akan di tampilkan di layar halaman*/

    val titleRes: Int
}