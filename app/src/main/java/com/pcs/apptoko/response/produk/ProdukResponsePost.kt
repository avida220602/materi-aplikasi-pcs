package com.pcs.apptoko.response.produk

class ProdukResponsePost (
    val `data` : DataProduk,
    val message : String,
    val success : Boolean
        )
data class DataProduk(
    val `produk` : Produk
)