package com.example.latihan_livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel(){
    val listProduct = arrayListOf(
        Product(R.drawable.iphone13, "Iphone 13", "Rp.13.000.000","Iphone 13 pro Garansi resmi Ibox"),
        Product(R.drawable.imac,"Imac Pro", "Rp.20.000.000", "Imac pro 100% original Garansi Resmi Ibox"),
        Product(R.drawable.xiamoi, "Xiaomi Note 9 Pro", "Rp.2.000.000", "Xiaomi Note 9 Pro Garansi 1 Tahun Resmi"),
        Product(R.drawable.kulkas, "Kulkas Plytron Belezza", "Rp.3.309.000","Inverter Lebih hemat listrik hingga 20%, Jumbo Capacity Rak lebih lebar hingga 58cm"),
        Product(R.drawable.ioniq,"Mobil Listrik Hyundai", "Rp.900.000.000", "Mobil listrik ioniq 5 dari Hyundai matic siap jalan"),
        Product(R.drawable.lerberg, "Lerberg","Rp.200.000","Beli LERBERG unit rak , abu-abu tua, 60x148 cm dengan harga terbaik di IKEA Furniture Online. ✓ Cicilan 0% ✓ 90 Hari Pengembalian. Belanja sekarang!"),
        Product(R.drawable.kacamata,"Kacamat photocromic","Rp.95.000", "Kacamata photocromic Termurah Belanja Sekarang!"),
    )
    var product: MutableLiveData<List<Product>> = MutableLiveData()

    fun getProduct(){
        product.value = listProduct
    }
}