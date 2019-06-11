package com.dalilandoulsi.clothesme.Services

import com.dalilandoulsi.clothesme.Model.Category
import com.dalilandoulsi.clothesme.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("hat polo", "15$", "hat1"),
        Product("hat hout polo", "15$", "hat2"),
        Product("hat hit polo", "15$", "hat3"),
        Product("hat het polo", "15$", "hat4"),
        Product("hat polo", "15$", "hat1"),
        Product("hat hout polo", "15$", "hat2"),
        Product("hat hit polo", "15$", "hat3"),
        Product("hat het polo", "15$", "hat4")
    )
    val hoodies = listOf(
        Product("hoodie nice", "30$", "hoodie1"),
        Product("hoodie hout polo", "45$", "hoodie2"),
        Product("hoodie hit polo", "55$", "hoodie3"),
        Product("hoodie het polo", "75$", "hoodie4"),
        Product("hoodie nice", "30$", "hoodie1"),
        Product("hoodie hout polo", "45$", "hoodie2"),
        Product("hoodie hit polo", "55$", "hoodie3"),
        Product("hoodie het polo", "75$", "hoodie4")
    )

    val tshirts = listOf(
        Product("shirt nice", "30$", "shirt1"),
        Product("shirt hout polo", "25$", "shirt2"),
        Product("shirt hit polo", "35$", "shirt3"),
        Product("shirt het polo", "25$", "shirt4"),
        Product("shirt nice", "30$", "shirt1"),
        Product("shirt hout polo", "25$", "shirt2"),
        Product("shirt hit polo", "35$", "shirt3"),
        Product("shirt het polo", "25$", "shirt4")
    )
    val digitalGoods = listOf<Product>()
    fun getProduct(category: String): List<Product> {

        return when (category) {
            "SHIRTS" -> tshirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGoods
        }
    }

}