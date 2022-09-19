package com.example.latihan_livedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_livedata.databinding.ItemProductBinding

class ProductAdapter(var listProduct: ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root){
        fun dataBinding(itemData : Product){
            binding.dataProduct = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        holder.dataBinding(listProduct[position])
        holder.binding.cardViewItem.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val bundle = Bundle()
                bundle.putSerializable("data", listProduct[position])
                Navigation.findNavController(holder.itemView).navigate(R.id.action_productFragment_to_detailProduct, bundle)
            }
        })
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }
    fun setProduct(itemData: ArrayList<Product>){
        this.listProduct = itemData
    }

}