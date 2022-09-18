package com.example.latihan_livedata

import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel(){
    val listProduct = arrayListOf(
        Product(R.drawable.iphone13, "Iphone 13", 1200000,"Iphone 13 pro Garansi resmi Ibox"),
        Product(R.drawable.imac,"Imac Pro", 20000000, "Imac pro 100% original Garansi Resmi Ibox"),
        Product(R.drawable.xiamoi, "Xiaomi Note 9 Pro", 2000000, "Xiaomi Note 9 Pro Garansi 1 Tahun Resmi"),
        
    )
}