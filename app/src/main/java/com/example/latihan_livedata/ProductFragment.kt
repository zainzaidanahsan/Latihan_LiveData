package com.example.latihan_livedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_livedata.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
    lateinit var vmProduct: ProductViewModel
    lateinit var adapteProduct: ProductAdapter
    lateinit var binding: FragmentProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vmProduct = ViewModelProvider(this).get(ProductViewModel::class.java)
        adapteProduct = ProductAdapter(ArrayList())
        vmProduct.getProduct()
        vmProduct.product.observe(viewLifecycleOwner, Observer {
            adapteProduct.setProduct(it as ArrayList<Product>)
        })
        binding.rvProduct.layoutManager = GridLayoutManager(context,2)
        binding.rvProduct.adapter = adapteProduct
    }

}