package com.dalilandoulsi.clothesme.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.dalilandoulsi.clothesme.Adapters.CatAdapter
import com.dalilandoulsi.clothesme.Model.Category
import com.dalilandoulsi.clothesme.R
import com.dalilandoulsi.clothesme.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter: CatAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CatAdapter(this, DataService.categories)
        CatListView.adapter = adapter
        CatListView.setOnItemClickListener { adapterView, view, i, l ->

            val category = DataService.categories[i]
            Toast.makeText(this,category.title,Toast.LENGTH_SHORT).show()
        }
    }
}
