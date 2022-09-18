package com.example.latihan_livedata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_livedata.databinding.ItemProductBinding

class ProductAdapter(var listProduct: ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root){
        fun dataBinding(itemData : Product){
            binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }
    fun setProduct(itemData: ArrayList<Product>){
        this.listProduct = itemData
    }

}