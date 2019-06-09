package com.dalilandoulsi.clothesme.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.dalilandoulsi.clothesme.Model.Category
import com.dalilandoulsi.clothesme.R

class CatAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val catView: View
        val holder: ViewHolder

        if (convertView == null) {

            holder = ViewHolder()
            catView = LayoutInflater.from(context).inflate(R.layout.cat_list_item, null)
            holder.catImage = catView.findViewById(R.id.catImg)
            holder.catName = catView.findViewById(R.id.catName)
            catView.tag = holder
            println("firsty")
        } else {
            holder = convertView.tag as ViewHolder
            catView = convertView
            println("recycle")

        }

        val category = categories[position]
        holder.catName?.text = category.title
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.catImage?.setImageResource(resourceId)
        return catView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {

        var catImage: ImageView? = null
        var catName: TextView? = null
    }
}