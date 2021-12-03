package com.example.sectog.spinner

import com.example.sectog.R

data class Country(val image: Int)

object Countries {

    private val images = intArrayOf(
        R.drawable.bluechooser,
        R.drawable.bluechooser,
        R.drawable.bluechooser,
        R.drawable.bluechooser,
        R.drawable.bluechooser,
        R.drawable.bluechooser
    )



    var list: ArrayList<Country>? = null
        get() {

            if (field != null)
                return field

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images[i]


                val country = Country(imageId)
                field!!.add(country)
            }

            return field
        }
}