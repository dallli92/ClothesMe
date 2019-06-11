package com.dalilandoulsi.clothesme.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.dalilandoulsi.clothesme.Model.Product
import com.dalilandoulsi.clothesme.R

class ProdAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProdAdapter.ProdHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProdHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProdHolder, position: Int) {

        holder?.bindProduct(products[position], context)
    }


    inner class ProdHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val proImg = itemView?.findViewById<ImageView>(R.id.prodImg)
        val proName = itemView?.findViewById<TextView>(R.id.prodName)
        val proPrice = itemView?.findViewById<TextView>(R.id.prodPrice)

        fun bindProduct(product: Product, context: Context) {

            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            proImg?.setImageResource(resourceId)
            proName?.text = product.title
            proPrice?.text = product.price
        }
    }
}