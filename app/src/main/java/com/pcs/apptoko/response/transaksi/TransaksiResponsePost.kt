package com.pcs.apptoko.response.transaksi

class TransaksiResponsePost (
    val `data` : TransaksiData,
    val message : String,
    val success : Boolean
)

data class TransaksiData(
    val `transaksi` : Transaksi,
)