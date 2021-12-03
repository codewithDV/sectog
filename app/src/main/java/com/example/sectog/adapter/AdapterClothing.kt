package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.ClothingdesignBinding


class AdapterClothing : RecyclerView.Adapter<AdapterClothing.ViewHolder>() {
    private val Imageprofile = arrayOf<Int>(
        R.drawable.clothingiv, R.drawable.clothingiv, R.drawable.clothingiv,
        R.drawable.clothingiv, R.drawable.clothingiv, R.drawable.clothingiv, R.drawable.clothingiv
    )
    private val imageWlike = arrayListOf<Int>(
        R.drawable.subclolikered, R.drawable.subclolikered, R.drawable.subclolikered,
        R.drawable.subclolikered, R.drawable.subclolikered, R.drawable.subclolikered, R.drawable.subclolikered
    )
    private val imageRlike = arrayListOf<Int>(
        R.drawable.subclohlike, R.drawable.subclohlike, R.drawable.subclohlike,
        R.drawable.subclohlike, R.drawable.subclohlike, R.drawable.subclohlike, R.drawable.subclohlike
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
    private val textPrice = arrayListOf<Int>(51,50,50,50,50,50,50)
    private val textPricy = arrayListOf<Int>(51,50,50,50,50,50,50)


    inner class ViewHolder(val binding: ClothingdesignBinding) : RecyclerView.ViewHolder(binding.root) {


        private val ivSubClothingSecond = itemView.findViewById<ImageView>(R.id.ivSubClothingSecond)
        init {
            ivSubClothingSecond.setOnClickListener {
                val navController = Navigation.findNavController(itemView)
                navController.navigate(R.id.action_categories2_to_subCatFrame)

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     //   val v = LayoutInflater.from(parent.context).inflate(R.layout.clothingdesign, parent, false)
    //   return ViewHolder(v)

        val binding = ClothingdesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivSubClothingSecond.setImageResource(Imageprofile[position])
        holder.binding.ivLikeWhiteSecond.setImageResource(imageWlike[position])
        holder.binding.ivLikeRedSecond.setImageResource(imageRlike[position])
        holder.binding.tvSubNameSecond.text=textName[position]
        holder.binding.tvSubProductNameSecond.text=textOutfit[position]
        holder.binding.tvSubPriceSecond.text = "$" + textPrice[position].toString()
        holder.binding.tvSubPrice2Second.text = "$" + textPrice[position].toString()




    }
}