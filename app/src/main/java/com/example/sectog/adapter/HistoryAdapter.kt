package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.HistorydesignBinding


class HistoryAdapter : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    private val Imageprofile = arrayOf<Int>(
        R.drawable.shoe2, R.drawable.dress, R.drawable.shoe2,
        R.drawable.dress, R.drawable.shoe2, R.drawable.dress, R.drawable.shoe2
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


    inner class ViewHolder(val binding: HistorydesignBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      //  val v = LayoutInflater.from(parent.context).inflate(R.layout.historydesign, parent, false)
      //  return ViewHolder(v)

        val binding = HistorydesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivSubClothingHistor.setImageResource(Imageprofile[position])
        holder.binding.ivLikeWhiteHistor.setImageResource(imageWlike[position])
        holder.binding.ivLikeRedHistor.setImageResource(imageRlike[position])
        holder.binding.tvSubNameHistor.text=textName[position]
        holder.binding.tvSubProductNamevHistor.text=textOutfit[position]
        holder.binding.tvSubPriceHistor.text = "$" + textPrice[position].toString()
        holder.binding.tvSubPrice2Histor.text = "$" + textPrice[position].toString()




    }
}