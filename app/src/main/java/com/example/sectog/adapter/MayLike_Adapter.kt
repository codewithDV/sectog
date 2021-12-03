package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.MaylikeadpdesignBinding

class MayLike_Adapter : RecyclerView.Adapter<MayLike_Adapter.ViewHolder>() {
    private val Imageprofile = arrayOf<Int>(
        R.drawable.maybuy, R.drawable.maybuy, R.drawable.color8,
        R.drawable.maybuy, R.drawable.maybuy, R.drawable.maybuy, R.drawable.maybuy
    )


    private val textName = arrayListOf<String>(
        "Classic crop Tee",
        "Classic crop Tee",
        "Classic crop Tee",
        "Classic crop Tee",
        "KClassic crop Tee",
        "Classic crop Tee",
        "Classic crop Tee"
    )
    private val textOutfit = arrayListOf<String>(
        "T-shirts",
        "T-shirts",
        "T-shirts",
        "T-shirts",
        "T-shirts",
        "T-shirts",
        "T-shirts"
    )

    inner class ViewHolder(val binding: MaylikeadpdesignBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //   val v = LayoutInflater.from(parent.context).inflate(R.layout.clothingdesign, parent, false)
        //   return ViewHolder(v)

        val binding =
            MaylikeadpdesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.imageView.setImageResource(Imageprofile[position])
        holder.binding.tvTshirttype.text = textName[position]
        holder.binding.tvClothType.text = textOutfit[position]



    }
}