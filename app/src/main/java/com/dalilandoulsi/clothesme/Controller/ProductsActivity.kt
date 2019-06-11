package com.dalilandoulsi.clothesme.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.dalilandoulsi.clothesme.Adapters.ProdAdapter
import com.dalilandoulsi.clothesme.R
import com.dalilandoulsi.clothesme.Services.DataService
import com.dalilandoulsi.clothesme.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var prodAdapter: ProdAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val catType = intent.getStringExtra(EXTRA_CATEGORY)
        productText.text = catType
        prodAdapter = ProdAdapter(this, DataService.getProduct(catType))
        var spanCount = 2
        val orientation = resources.configuration.orientation
        val screeSize = resources.configuration.screenHeightDp
        if (screeSize > 720) {
            spanCount = 3
        }

        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
            spanCount = 3
        val layoutManager = GridLayoutManager(this, spanCount)
        ProdListView.layoutManager = layoutManager
        ProdListView.adapter = prodAdapter
    }
}
