package com.pcs.apptoko.response.cart

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Cart (
    var id: Int,
    var harga : Int,
    var qty : Int
    ):Parcelable