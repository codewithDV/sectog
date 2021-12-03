package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.SubcatdesigngridBinding
import androidx.constraintlayout.widget.ConstraintSet





class SubCatAdapter : RecyclerView.Adapter<SubCatAdapter.ViewHolder>() {
    var isSingleDimension = false   //by default false
    private val Imageprofile = arrayOf<Int>(
        R.drawable.subcativ1, R.drawable.subcativ2, R.drawable.subcativ3,
        R.drawable.subcativ4, R.drawable.subcativ5, R.drawable.subcativ6, R.drawable.subcativ1
    )
    private val imageWlike = arrayListOf<Int>(
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered
    )
    private val imageRlike = arrayListOf<Int>(
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike
    )
    private val textName = arrayListOf<String>(
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped"
    )
    private val textOutfit = arrayListOf<String>(
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfittersd"
    )
    private val textPrice = arrayListOf<Int>(51, 50, 50, 50, 50, 50, 50)
    private val textPricy = arrayListOf<Int>(51, 50, 50, 50, 50, 50, 50)


    inner class ViewHolder(val binding: SubcatdesigngridBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val v = LayoutInflater.from(parent.context)
//            .inflate(R.layout.subcatdesigngrid, parent, false)
//        return ViewHolder(v)
        val binding =
            SubcatdesigngridBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivSubClothingSubCat.setImageResource(Imageprofile[position])
        holder.binding.ivLikeWhiteSubCat.setImageResource(imageWlike[position])
        holder.binding.ivLikeRedSubCat.setImageResource(imageRlike[position])
        holder.binding.tvSubNameSubCat.text = textName[position]
        holder.binding.tvSubProductNamevSubCat.text = textOutfit[position]
        holder.binding.tvSubPriceSubCat.text = "$" + textPrice[position].toString()
        holder.binding.tvSubPrice2SubCat.text = "$" + textPrice[position].toString()

        //  holder.binding?.ivSubClothingSubCat?.getLayoutParams()!!.width = 200
        if (isSingleDimension) {     // false
            val layoutParams = holder.binding.ivSubClothingSubCat.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.dimensionRatio = "W,16:9"      // set para meters
            holder.binding.ivSubClothingSubCat.layoutParams = layoutParams
        } else {                    // true
            val layoutParams = holder.binding.ivSubClothingSubCat.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.dimensionRatio = "H,16:9"        // set para meters
            holder.binding.ivSubClothingSubCat.layoutParams = layoutParams
        }


    }

    fun isSingleImageDimension(isSingle: Boolean) {     //given false value
        isSingleDimension = isSingle
        notifyDataSetChanged()
    }


}