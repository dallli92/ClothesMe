package com.dalilandoulsi.clothesme.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dalilandoulsi.clothesme.Model.Product
import com.dalilandoulsi.clothesme.R
import com.dalilandoulsi.clothesme.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_details.*

class ProductDetailsActivity : AppCompatActivity() {
    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
        product = intent.getParcelableExtra(EXTRA_PRODUCT)
        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        prodDetailImage.setImageResource(resourceId)
        prodDetailName.text = product.title
        prodDetailPrice.text = product.price
    }
}
