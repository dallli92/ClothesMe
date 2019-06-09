package com.dalilandoulsi.clothesme.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.dalilandoulsi.clothesme.Adapters.CatAdapter
import com.dalilandoulsi.clothesme.Adapters.CatRecyAdapter
import com.dalilandoulsi.clothesme.Model.Category
import com.dalilandoulsi.clothesme.R
import com.dalilandoulsi.clothesme.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter: CatRecyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CatRecyAdapter(this, DataService.categories)
        CatListView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        CatListView.layoutManager = layoutManager
        CatListView.setHasFixedSize(true)
    }
}
