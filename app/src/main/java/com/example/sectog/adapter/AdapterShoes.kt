package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.AdaptershoedesignBinding

class AdapterShoes : RecyclerView.Adapter<AdapterShoes.ViewHolder>() {
    private val Imageprofile = arrayOf<Int>(
        R.drawable.pinkshoe, R.drawable.pinkshoe, R.drawable.pinkshoe,
        R.drawable.pinkshoe, R.drawable.pinkshoe, R.drawable.pinkshoe, R.drawable.pinkshoe
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


    inner class ViewHolder(val binding: AdaptershoedesignBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     //   val v = LayoutInflater.from(parent.context).inflate(R.layout.adaptershoedesign, parent, false)
     //   return ViewHolder(v)

        val binding = AdaptershoedesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)



    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivShoe.setImageResource(Imageprofile[position])
        holder.binding.ivLikeWhiteShoe.setImageResource(imageWlike[position])
        holder.binding.ivLikeRedShoe.setImageResource(imageRlike[position])
        holder.binding.tvShoe.text = textName[position]
        holder.binding.tvShoeDec.text = textOutfit[position]
        holder.binding.tvShoePrice.text = "$" + textPrice[position].toString()
        holder.binding.tvShoePrice2.text = "$" + textPrice[position].toString()


    }
}