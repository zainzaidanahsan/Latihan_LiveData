package com.example.latihan_livedata

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.latihan_livedata.databinding.FragmentDetailProductBinding
import com.example.latihan_livedata.databinding.FragmentProductBinding

class DetailProduct : Fragment() {
    lateinit var binding: FragmentDetailProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getProduct = arguments?.getSerializable("data") as Product
        binding.dataProduct = getProduct

        binding.btnBeli.setOnClickListener(){
            var message = "Halo saya ingin membeli produk ${getProduct.nama} dengan harga ${getProduct.harga}, apakah masih ready?"
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/semd?phone=085691444187 Number&text=$message"))
            startActivity(intent)
        }
    }
}