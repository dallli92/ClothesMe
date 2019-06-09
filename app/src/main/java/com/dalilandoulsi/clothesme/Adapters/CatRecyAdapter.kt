package com.dalilandoulsi.clothesme.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.dalilandoulsi.clothesme.Model.Category
import com.dalilandoulsi.clothesme.R
import kotlinx.android.synthetic.main.cat_list_item.view.*

class CatRecyAdapter(val context: Context, val categories: List<Category>) :
    RecyclerView.Adapter<CatRecyAdapter.Holder>() {


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.biindCat(categories[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val catImg = itemView?.findViewById<ImageView>(R.id.catImg)
        val catName = itemView?.findViewById<TextView>(R.id.catName)
        fun biindCat(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            catImg?.setImageResource(resourceId)
            catName?.text = category.title
        }
    }
}